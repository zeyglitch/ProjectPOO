public class Test {
    public static void main(String[] args) {
        Simulation simul = new Simulation();
        Patient p1 = new PatientAdulte("Em", "James", 0.1F, 0.4F);
        simul.ajouterPatient(p1);

        //Patient p2 = new PatientAdulte("Cry", "Mark", 2.0F, 2.0F);
        //simul.ajouterPatient(p2);

        PathogeneClassique corona = new PathogeneClassique("Corona", TypePatho.VIRUS, 0.3F, 0.2F);
        simul.ajouterPathogene(corona, 0F, 10);

        Medicament med1 = new Medicament("Doliprane", 0.8F, 1.0F, 3, 0.5F);
        simul.ajouterMed(corona, med1, 0.1F, 0);

        simul.debutSimul();
        simul.simulerCycle();
        simul.simulerCycle();
        simul.simulerCycle();
        simul.simulerCycle();
        simul.simulerCycle();
        simul.simulerCycle();
        simul.simulerCycle();
        simul.simulerCycle();

    }
}
