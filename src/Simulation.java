import java.util.ArrayList;

public class Simulation{
    private int currentCycle = 1;
    private ArrayList<Patient> patients = new ArrayList<Patient>();

    public Simulation(){
        
    }

    public Simulation(Patient p){
        ajouterPatient(p);
    }

    public void ajouterPatient(Patient p){
        patients.add(p);
    }

    public void ajouterPathogene(Pathogene patho, float itInit, float chargeInit){
        for(Patient p: patients){
            p.ajouterPatho(patho, itInit, chargeInit);
        }
    }

    public void ajouterMed(Pathogene patho, Medicament med, float resM, float concMed){
        for(Patient p: patients){

            Medicament copieMed = new Medicament(
                medModele.getNom(),
                medModele.getTauxDisparition(),
                medModele.getDosePrescrite(),
                medModele.getIntervalleCycleDose(),
                medModele.getSensibilite()
            );
            
            p.ajouterMedPourPatho(patho, copieMed, resM, concMed);
        }
    }

    public void debutSimul(){
        System.out.println("---- Debut simulation ----");
        for(Patient p: patients){
            System.out.println(p.toString());
        }
    }

    public void simulerCycle(){
        System.out.println("---- Cycle " + currentCycle +" ----");
        for(Patient p: patients){
            p.updateIt();
            System.out.println(p.toString());
        }
        currentCycle++;
    }


}
