public class Test {
    public static void main(String[] args) {
        Simulation simul = new Simulation();
        Patient p1 = new PatientAdulte("Em", "James", 1.0F, 1.0F);
        simul.ajouterPatient(p1);

        Patient p2 = new PatientAdulte("Cry", "Mark", 2.0F, 2.0F);
        simul.ajouterPatient(p2);

        PathogeneClassique corona = new PathogeneClassique("Corona", TypePatho.VIRUS, 30.0F, 2.0F, 3.0F, p1);
        simul.ajouterPathogene(corona, 3.0F);

        PathogeneClassique corona2 = new PathogeneClassique("Corona", TypePatho.VIRUS, 30.0F, 2.0F, 3.0F, p2);
        simul.ajouterPathogene(corona2, 3.0F);

        Medicament med1 = new Medicament("Doliprane", 2, 1, 1, 2);
        simul.ajouterMed(corona, med1, 2);

        simul.debutSimul();
        simul.simulerCycle();

    }
}
