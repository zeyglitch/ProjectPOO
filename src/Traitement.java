public class Traitement {

    private Medicament medicament;

    /*
    Dose de médicament présente dans le corps au temps t (D_m,t)
    */
    private float doseActuelleDm;

    /**
    La dose prescrite à chaque prise (d_m,t)
    */
    private float dosePrescrite;

    /*
    Fréquence de prise en nombre de cycles
    */
    private int intervallePrise;

    public Traitement(Medicament medicament, float dosePrescrite, int intervallePrise) {
        this.medicament = medicament;
        this.dosePrescrite = dosePrescrite;
        this.intervallePrise = intervallePrise;
        this.doseActuelleDm = 0;
    }

    /*
    Fait évoluer la concentration du médicament dans le corps selon le cycle
    Applique l'équation : D(t+1) = h * D(t) + d(t)
     */
    public void evoluerConcentration(Cycle cycleActuel) {
        float h = this.medicament.getTauxDisparition();
        float dosePriseAujourdhui = 0;
        if (cycleActuel.getNumero() % this.intervallePrise == 0) {
            dosePriseAujourdhui = this.dosePrescrite;
        }
        this.doseActuelleDm = (h * this.doseActuelleDm) + dosePriseAujourdhui;
    }

    /*
    Renvoie la dose D(t) disponible pour attaquer le virus
    */
    public float getDoseActuelle() {
        return this.doseActuelleDm;
    }

    public Medicament getMedicament() {
        return this.medicament;
    }

    @Override
    public String toString() {
        return "Traitement{" + "Med=" + medicament.getNom() + ", DoseCorps=" +  doseActuelleDm + '}';
    }
}