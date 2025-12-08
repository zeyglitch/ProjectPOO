public class Test {
    public static void main(String[] args) {
        Simulation simul = new Simulation();
        Patient p1 = new PatientAdulte("Em", "James", 1.0F, 1.0F);
        simul.ajouterPatient(p1);
        PathogeneClassique corona = new PathogeneClassique("Corona", TypePatho.VIRUS, 100.0F, 2.0F, 2.0F, p1);
        simul.ajouterPathogene(corona, 3.0F);

        simul.debutSimul();
        simul.simulerCycle();
        simul.simulerCycle();
    }
}
