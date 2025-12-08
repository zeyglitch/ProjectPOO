import java.util.ArrayList;

public class Simulation{
    private int currentCycle = 0;
    private ArrayList<Patient> patients = new ArrayList<Patient>();

    public Simulation(){
        
    }

    public Simulation(Patient p){
        ajouterPatient(p);
    }

    public void ajouterPatient(Patient p){
        patients.add(p);
    }

    public void ajouterPathogene(Pathogene patho, float itInit){
        for(Patient p: patients){
            p.ajouterPatho(patho, itInit);
        }
    }

    public void ajouterMed(Pathogene patho, Medicament med, float resM, float dose){
        Traitement traitement = patho.getTraitement();
        traitement.ajouterMed(med, resM, dose);
    }

    public void debutSimul(){
        for(Patient p: patients){
            System.out.println(p.toString());
        }
    }

    public void simulerCycle(){
        for(Patient p: patients){
            p.updateIt();
            System.out.println(p.toString());
        }
        currentCycle++;
    }


}