import java.util.ArrayList;
import java.util.HashMap;

public class Traitement {
    private HashMap<Medicament, Float> resistanceMed;
    private ArrayList<Medicament> medicaments;
    private Pathogene pathogene;
    public Traitement(){

    }

    public Traitement(Medicament m){
        medicaments = new ArrayList<>();
        medicaments.add(m);
    }

    public Traitement(ArrayList<Medicament> listeMed){
        medicaments = listeMed;
    }

    public void ajouterMed(Medicament m, float res){
        resistanceMed.put(m, res);
    }

    public float getSomme(){
        float result = 0.0F;
        for(Medicament m: medicaments){
            result += pathogene.getsensibilite() * m.getCurrentDm() * (1-resistanceMed.get(m));
        }
        updateResPatho();
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
}
