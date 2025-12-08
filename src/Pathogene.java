public abstract class Pathogene {
    protected String nom;
    protected float tauxRep, sensibilite;
    protected TypePatho type;

    public Pathogene(String nom, TypePatho type, float tauxRep, float sensibilite) {
        this.nom = nom;
        this.type = type;
        this.tauxRep = tauxRep;
        this.sensibilite = sensibilite;
    }

    public String getNom() {
        return nom;
    }   
    public TypePatho getType() {
        return type;
    }

    public float getTauxRep() {
        return tauxRep;
    }
    public float getsensibilite() {
        return sensibilite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setType(TypePatho type) {
        this.type = type;
    }
    public void setTauxRep(float tauxRep) {
        this.tauxRep = tauxRep;
    }   
    public void setsensibilite(float sensibilite) {
        this.sensibilite = sensibilite;
    }

    public abstract Float updateChargeInf(Patient p);


    @Override
    public String toString(){
        return this.getClass().getName() + " " +nom;
    }
    
}
