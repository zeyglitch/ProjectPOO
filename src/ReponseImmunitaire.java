

public abstract class ReponseImmunitaire {
private float coefFatigue;
private float reactSystImmu;
private float reponseimmuit;
private Patient patient;

public ReponseImmunitaire(float coefFatigue, float reactSystImmu) {
    this.coefFatigue = coefFatigue;
    this.reactSystImmu = reactSystImmu;
}

public float getCoefFatigue() {
    return coefFatigue;
}
public float getReactSystImmu() {
    return reactSystImmu;
}
public Patient getPatient() {
    return patient;
}

public abstract float mettreAJourImmunite(Pathogene pathogene);

}
