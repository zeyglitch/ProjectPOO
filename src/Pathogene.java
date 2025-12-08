public abstract class Pathogene {
    protected String nom;
    protected float currentChargeInf, tauxRep, sensibilite;
    protected TypePatho type;
    protected Patient patient;
    protected Traitement traitement;

    public Pathogene(String nom, TypePatho type, float currentChargeInf, float tauxRep, float sensibilite, Patient patient) {
        this.nom = nom;
        this.type = type;
        this.currentChargeInf = currentChargeInf;
        this.tauxRep = tauxRep;
        this.sensibilite = sensibilite;
        this.patient = patient;
    }


    public String getNom() {
        return nom;
    }   
    public TypePatho getType() {
        return type;
    }
    public float getcurrentChargeInf() {
        return currentChargeInf;
    }
    public float getTauxRep() {
        return tauxRep;
    }
    public float getsensibilite() {
        return sensibilite;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setType(TypePatho type) {
        this.type = type;
    }
    public void setcurrentChargeInf(float currentChargeInf) {
        this.currentChargeInf = currentChargeInf;
    }
    public void setTauxRep(float tauxRep) {
        this.tauxRep = tauxRep;
    }   
    public void setsensibilite(float sensibilite) {
        this.sensibilite = sensibilite;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Traitement getTraitement(){
        return traitement;
    }

    public abstract Float updateChargeInf();

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().toString());
        sb.append(" "+nom +" (It = "+patient.getItPourPatho(this)+"; Lt = " + currentChargeInf + ")");
        return sb.toString();
    }
    
}
