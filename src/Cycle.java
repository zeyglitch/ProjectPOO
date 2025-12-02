
public class Cycle {

    // Attribut privé
    private int numero;

    // Constructeur : Initialise le cycle (généralement à 0 au départ)
    public Cycle() {
        this.numero = 0;
    }

    // Méthode pour passer au cycle suivant
    public void incrementer() {
        this.numero++;
    }

    // Méthode pour récupérer le numéro du cycle actuel
    // Note : Le nom est 'getNumber' selon votre UML (et non getNumero)
    public int getNumber() {
        return this.numero;
    }
}
