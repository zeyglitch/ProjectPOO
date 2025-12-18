public class Medicament {

    private String nom;

    /*
    Sensibilité du pathogène au médicament (alpha_m)
    */
    private float sensibilite;

    /*
    Taux de disparition du médicament (h)
    */
    private float tauxDisparition;

    public Medicament(String nom, float sensibilite, float tauxDisparition) {
        this.nom = nom;
        this.sensibilite = sensibilite;
        this.tauxDisparition = tauxDisparition;
    }

    public String getNom() {
        return nom;
    }

    public float getSensibilite() {
        return sensibilite;
    }

    public float getTauxDisparition() {
        return tauxDisparition;
    }

    @Override
    public String toString() {
        return nom + " (alpha=" + sensibilite + ", h=" + tauxDisparition + ")";
    }
}