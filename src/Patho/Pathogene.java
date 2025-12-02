abstract class Pathogene {
    protected String nom;
    protected float chargeL, tauxRep, sensibiliteImmuno, resistanceMedm, strategyResistance;
    protected TypePatho type;
    public Pathogene(String nom, TypePatho type, float chargeL, float tauxRep, float sensibiliteImmuno, float resistanceMedm, float strategyResistance) {
        this.nom = nom;
        this.type = type;
        this.chargeL = chargeL;
        this.tauxRep = tauxRep;
        this.sensibiliteImmuno = sensibiliteImmuno;
        this.resistanceMedm = resistanceMedm;
        this.strategyResistance = strategyResistance;
    }

    public String getNom() {
        return nom;
    }   
    public TypePatho getType() {
        return type;
    }
    public float getChargeL() {
        return chargeL;
    }
    public float getTauxRep() {
        return tauxRep;
    }
    public float getSensibiliteImmuno() {
        return sensibiliteImmuno;
    }
    public float getResistanceMedm() {
        return resistanceMedm;
    }
    public float getStrategyResistance() {
        return strategyResistance;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setType(TypePatho type) {
        this.type = type;
    }
    public void setChargeL(float chargeL) {
        this.chargeL = chargeL;
    }
    public void setTauxRep(float tauxRep) {
        this.tauxRep = tauxRep;
    }   
    public void setSensibiliteImmuno(float sensibiliteImmuno) {
        this.sensibiliteImmuno = sensibiliteImmuno;
    }
    public void setResistanceMedm(float resistanceMedm) {
        this.resistanceMedm = resistanceMedm;
    }
    public void setStrategyResistance(float strategyResistance) {
        this.strategyResistance = strategyResistance;
    }
    
    public float calculerNouvelleChargeL() {    
    }
    protected abstract float calculerReplication(float chargeActu);

}   