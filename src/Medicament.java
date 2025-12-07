public class Medicament {
    private String nom;
    private float tauxDisp;
    private float currentDm;
    private int intervalleCycleDose;
    private int numCycleCourant = 0;


    public float getCurrentDm(){
        return currentDm;
    }
}
