public class Test {
    public static void main(String[] args) {
        Simulation simul = new Simulation();
        Patient p1 = new PatientAdulte("Em", "James", 1.0F, 1.0F);
        simul.ajouterPatient(p1);

        Patient p2 = new PatientAdulte("Cry", "Mark", 2.0F, 2.0F);
        simul.ajouterPatient(p2);

        PathogeneClassique corona = new PathogeneClassique("Corona", TypePatho.VIRUS, 2.0F, 2.0F);
        simul.ajouterPathogene(corona, 3.0F, 100F);

        Medicament med1 = new Medicament("Doliprane", 2, 1, 1, 2);
        simul.ajouterMed(corona, med1, 2.0F, 2F);

        simul.debutSimul();
        simul.simulerCycle();

    }
}
