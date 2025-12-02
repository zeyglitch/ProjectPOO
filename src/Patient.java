
import java.util.Date;

public class Patient {
private String nom;
private String prenom;
private Date dateNaissance;
private HashTable<Infection, ReponseImmunitaire> reponseImParInfection;

public Patient(String nom, String prenom, Date dateNaissance) {
    this.nom = nom;
    this.prenom = prenom;
    this.dateNaissance = dateNaissance;
    this.reponseImParInfection = new HashTable<Infection, ReponseImmunitaire>();
}

public void simulercycle(Cycle cycle){


}
public void ajouterInfection(Infection infection, ReponseImmunitaire reponseImmunitaire){
    this.reponseImParInfection.put(infection, reponseImmunitaire);
}

}
