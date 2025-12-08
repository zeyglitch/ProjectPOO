import java.util.ArrayList;
import java.util.HashMap;

public class Traitement {
    private HashMap<Medicament, Float> resistanceMed;
    private HashMap<Medicament, Float> doseMed;
    private Pathogene pathogene;
    public Traitement(){

    }

    public Traitement(Medicament m, float res, float dose){
       ajouterMed(m, res, dose);
    }


    public void ajouterMed(Medicament m, float res, float dose){
        resistanceMed.put(m, res);
        doseMed.put(m, dose);
    }

    public float getSomme(){
        float result = 0.0F;
        for(Medicament m: doseMed.keySet()){
            result += pathogene.getsensibilite() * doseMed.get(m) * (1-resistanceMed.get(m));
        }
        updateResPatho();
        updateDoseMed();
        return result;
    }

    public void updateResPatho(){
        if(pathogene instanceof IResistanceDynamique){
            IResistanceDynamique dynamicPathogene = (IResistanceDynamique) pathogene;
            for(Medicament m: resistanceMed.keySet()){
                float oldRes = resistanceMed.get(m);
                float newRes = dynamicPathogene.calculerNouvelleResistance(m);
                resistanceMed.replace(m, oldRes, newRes);
            }
        }
    }

    public ArrayList<Medicament> getMedicaments(){
        return new ArrayList<Medicament>(resistanceMed.keySet());
    }

    public Float getCurrentDmForMed(Medicament m){
        return resistanceMed.get(m);
    }

    public void updateDoseMed() {
        for(Medicament m: doseMed.keySet()){
            float h = m.getTauxDisparition();
            float dosePriseAujourdhui = 0;
            if (m.getNumCycleCourant() % m.getIntervalleCycleDose() == 0) {
                dosePriseAujourdhui = m.getDosePrescrite();
            }
            float oldDm = getCurrentDmForMed(m);
            float newDm = (h * oldDm) + dosePriseAujourdhui;
            doseMed.replace(m,oldDm, newDm );
            m.nextCycle();
        }
    }

}
