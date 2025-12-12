package medicament;
import java.util.ArrayList;
import java.util.HashMap;

import pathogene.IResistanceDynamique;
import pathogene.Pathogene;

public class Traitement {
    private HashMap<Medicament, Float> resistanceMed = new HashMap<>();
    private HashMap<Medicament, Float> concentrationMed = new HashMap<>();
    private Pathogene pathogene;

    public Traitement(){

    }

    public Traitement(Medicament m, float res, float dose){
       ajouterMed(m, res, dose);
    }

    public void setPathogene(Pathogene p){
        this.pathogene = p;
    }

    public void ajouterMed(Medicament m, float res, float conMed){
        resistanceMed.put(m, res);
        concentrationMed.put(m, conMed);
    }

    public float getSomme(){
        float result = 0.0F;
        updateResPatho();
        updateDoseMed();
        for(Medicament m: concentrationMed.keySet()){
            result += m.getSensibilite() * concentrationMed.get(m) * (1-resistanceMed.get(m));
        }
        return result;
    }

    public void updateResPatho(){
        if(pathogene instanceof IResistanceDynamique){
            IResistanceDynamique dynamicPathogene = (IResistanceDynamique) pathogene;
            for(Medicament m: resistanceMed.keySet()){
                float oldRes = resistanceMed.get(m);
                float dm = getCurrentDmForMed(m);
                float newRes = dynamicPathogene.calculerNouvelleResistance(oldRes, dm);
                resistanceMed.replace(m, oldRes, newRes);
            }
        }
    }

    public ArrayList<Medicament> getMedicaments(){
        return new ArrayList<Medicament>(resistanceMed.keySet());
    }

    public Float getCurrentDmForMed(Medicament m){
        return concentrationMed.get(m);
    }

        public Float getCurrentRmForMed(Medicament m){
        return resistanceMed.get(m);
    }

    public void updateDoseMed() {
        for(Medicament m: concentrationMed.keySet()){
            float h = m.getTauxDisparition();
            float dosePriseAujourdhui = 0;
            if (m.getNumCycleCourant() % m.getIntervalleCycleDose() == 0) {
                dosePriseAujourdhui = m.getDosePrescrite();
            }
            float oldDm = getCurrentDmForMed(m);
            float newDm = (h * oldDm) + dosePriseAujourdhui;
            concentrationMed.replace(m,oldDm, newDm );
            m.nextCycle();
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Medicament m: concentrationMed.keySet()){
            sb.append("\t#" + m.toString() + " (Dm = "+getCurrentDmForMed(m) + "; Rm = " +getCurrentRmForMed(m)+")");
        }
        return sb.toString();
    }

}
