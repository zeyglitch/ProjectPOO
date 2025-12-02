
import java.util.ArrayList;
import java.util.List;

public class Simulation {

    // Associations définies par les flèches du diagramme
    private Cycle cycle;
    private List<Patient> patients;

    // Constructeur
    public Simulation() {
        this.cycle = new Cycle();
        this.patients = new ArrayList<>();
    }

    // Méthode utilitaire pour ajouter des patients (nécessaire pour peupler la liste)
    // Même si elle n'est pas explicite dans l'UML, elle est implicite via la relation "contient"
    public void ajouterPatient(Patient p) {
        this.patients.add(p);
    }

    // Méthode step() : Fait avancer le cycle et prévient tous les patients
    public void step() {
        // 1. On incrémente le cycle
        this.cycle.incrementer();

        // 2. On demande à chaque patient de simuler ce nouveau cycle
        // On utilise la méthode 'simulerCycle' définie dans votre UML Patient
        for (Patient p : patients) {
            p.simulerCycle(this.cycle);
        }
    }

    // Méthode principale de la simulation
    public void lancerSimulation(int nbCycles) {
        for (int i = 0; i < nbCycles; i++) {
            step();
        }
        System.out.println("Fin de la simulation (" + nbCycles + " cycles).");
    }
}
