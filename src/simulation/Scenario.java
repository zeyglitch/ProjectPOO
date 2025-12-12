package simulation;
import medicament.*;
import pathogene.*;
import patient.*;

// Décommenter les simulations souhaitées dans la méthode main pour les exécuter

public class Scenario {
    public static void main(String[] args) {

        /* 
        //Décommenter pour exécuter la première simulation
        System.out.println("Premiere simulation avec un patient adulte et un pathogène classique");
        Simulation simul = new Simulation();
        Patient p1 = new PatientAdulte("Em", "James", 0.1F, 0.4F);
        simul.ajouterPatient(p1);
        PathogeneClassique corona = new PathogeneClassique("Corona", TypePatho.VIRUS, 0.3F, 0.2F);
        simul.ajouterPathogene(corona, 0F, 10);
        Medicament med1 = new Medicament("Doliprane", 0.8F, 1.0F, 3, 0.5F);
        simul.ajouterMed(corona, med1, 0.1F, 0);
        simul.debutSimul();
        for (int i = 0; i < 20; i++) {
            simul.simulerCycle();
        }
        */



        

        /* 
        //Décommenter pour exécuter la deuxième simulation 
        System.out.println("Deuxieme simulation avec un patient jeune et un pathogène classique");
        Simulation simul2 = new Simulation();
        PatientJeune p2 = new PatientJeune("Cry", "Mark", 0.1F, 0.4F);
        simul2.ajouterPatient(p2);
        PathogeneClassique corona2 = new PathogeneClassique("Corona", TypePatho.VIRUS, 0.3F, 0.2F);
        simul2.ajouterPathogene(corona2, 0F, 10);
        Medicament med2 = new Medicament("Doliprane", 0.8F, 1.0F, 3, 0.5F);
        simul2.ajouterMed(corona2, med2, 0.1F, 0);
        simul2.debutSimul();
        for (int i = 0; i < 20; i++) {
            simul2.simulerCycle();
        }
        //Observations :
        // On remarque que le patient jeune ne guérit pas, son système immunitaire et le médicament ne suffisent pas à faire baisser la charge infectieuse.
        */





        /*
        //Décommenter pour exécuter la troisième simulation 
        System.out.println("Troisieme simulation avec un patient adulte et un pathogène classique resistance dynamique");
        Simulation simul3 = new Simulation();
        Patient p3 = new PatientJeune("GoodMan", "Sal", 0.1F, 0.4F);
        simul3.ajouterPatient(p3);
        PathogeneClassiqueResDyn corona3 = new PathogeneClassiqueResDyn("Corona", TypePatho.VIRUS, 0.3F, 0.2F);
        simul3.ajouterPathogene(corona3, 0F, 10);
        Medicament med3 = new Medicament("Doliprane", 0.8F, 1.0F, 3, 0.5F);
        simul3.ajouterMed(corona3, med3, 0.1F, 0);
        simul3.debutSimul();
        for (int i = 0; i < 20; i++) {
            simul3.simulerCycle();
        }
        //Observations :
        // On remarque que le patient ne guérit pas, la résistance dynamique du pathogène fait que le médicament perd en efficacité au fil des cycles.
        */





        /* 
        //Decomenter pour exécuter la quatrième simulation
        System.out.println("Quatrieme avec 3 patients adultes et un pathogène classique");
        Simulation simul4 = new Simulation();
        Patient p4 = new PatientAdulte("Joe", "Bob", 0.1F, 0.4F);
        Patient p5 = new PatientAdulte("Rock", "Dwayne", 0.3F, 0.4F);
        Patient p6 = new PatientAdulte("John", "Cena", 0.1F, 0.6F);
        simul4.ajouterPatient(p4);
        simul4.ajouterPatient(p5);
        simul4.ajouterPatient(p6);
        PathogeneClassique corona = new PathogeneClassique("Corona", TypePatho.VIRUS, 0.3F, 0.2F);
        simul4.ajouterPathogene(corona, 0F, 10);
        Medicament med1 = new Medicament("Doliprane", 0.8F, 1.0F, 3, 0.5F);
        simul4.ajouterMed(corona, med1, 0.1F, 0);
        simul4.debutSimul();
        for (int i = 0; i < 20; i++) {
            simul4.simulerCycle();
        }
        //Observations :
        // On remarque que le patient avec la meilleure réactivité du système immunitaire guérit le plus rapidement (charge infectieuse diminue plus vite).
        // On remarque aussi que le patient avec le plus fort coefficient de fatigue guérit le plus lentement (charge infectieuse diminue plus lentement).
        // Ainsi, notre simulation prend bien en compte les caractéristiques des patients conforme à la réalité.
        */


    }
}
