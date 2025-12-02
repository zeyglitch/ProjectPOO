package mybranch.ProjectPOO.src;

public class Medicament {
    private String nom;
    private float sensibilite;
    private float tauxDisparition;
    private int intervalleDose;
    private float dose;

    public Medicament(String nom, float sensibilite, float tauxDisparition, int intervalleDose, float dose){
        this.nom = nom;
        this.sensibilite = sensibilite;
        this.tauxDisparition = tauxDisparition;
        this.intervalleDose = intervalleDose;
        this.dose = dose;
    }

    public int getIntervalleDose(){
        return intervalleDose;
    }

    public float getDose(){
        return dose;
    }

    public float getSensibilite(){
        return sensibilite;
    }

    public float getTauxDisparition(){
        return tauxDisparition;
    }
    
    public String getNom(){
        return nom;
    }

    public float doseMedicament(int numCycle){
        float result = 0;
        if(numCycle%intervalleDose == 0){
            result = dose;
        }
        return result;          
    }
}
