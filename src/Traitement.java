package mybranch.ProjectPOO.src;

import java.util.Hashtable;


public class Traitement {
    private Hashtable<Medicament, Float> concentrationChaqueMed;
    private int cycleCurrent = 0;

    public void ajouterMedicament(Medicament med){
       concentrationChaqueMed.put(med, 100.0f);
    }
    

    public void evolConcentrationMed(){
        cycleCurrent++;
        for (Medicament m: concentrationChaqueMed.keySet()){
            float oldConcentration = concentrationChaqueMed.get(m);
            float nvConcentration = m.getTauxDisparition() * oldConcentration + m.doseMedicament(cycleCurrent);
            concentrationChaqueMed.replace(m, oldConcentration, nvConcentration);
        }
    }
}
