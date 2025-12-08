public class Medicament {
    private String nom;
    private float tauxDisp;
    private float dosePrescrite;
    private float sensibilite;
    private int intervalleCycleDose;
    private int numCycleCourant = 0;

    public Medicament(String nom, float tauxDisp, float dosePrescrite, int intervalleCycleDose, float sensibilite){
        this.nom = nom;
        this.tauxDisp = tauxDisp;
        this.dosePrescrite = dosePrescrite;
        this.intervalleCycleDose = intervalleCycleDose;
        this.sensibilite = sensibilite;
    }

    public String getNom(){
        return nom;
    }

    public float getSensibilite(){
        return sensibilite;
    }

    public float getTauxDisparition(){
        return tauxDisp;
    }

    public int getIntervalleCycleDose(){
        return intervalleCycleDose;
    }

    public float getDosePrescrite(){
        return dosePrescrite;
    }

    public float getNumCycleCourant(){
        return numCycleCourant;
    }

    public void nextCycle(){
        numCycleCourant++;
    }

    @Override
    public String toString(){
        return nom;
    }

    


}
