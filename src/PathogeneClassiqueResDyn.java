public class PathogeneClassiqueResDyn extends Pathogene implements IResistanceDynamique{
    private float tauxImpact = 0.5F;

    public PathogeneClassiqueResDyn(String nom, TypePatho type, float tauxRep, float sensibilite) {
        super(nom, type, tauxRep, sensibilite);
    }

    public PathogeneClassiqueResDyn(String nom, TypePatho type, float tauxRep, float sensibilite, float tauxImpact) {
        super(nom, type, tauxRep, sensibilite);
        this.tauxImpact = tauxImpact;
    }

    public float calculerNouvelleResistance(float oldRes, float dm){
        return oldRes + tauxImpact*dm;
    }

    public Float updateChargeInf(Patient p){
        float sommeTraitement = p.getTraitementPourPatho(this).getSomme();
        float it = p.getItPourPatho(this);
        float oldLt = p.getChargePourPatho(this);
        float newLt = oldLt + tauxRep*oldLt - sensibilite*it - sommeTraitement;
        if(newLt>0){
            p.updateChargePatho(this, newLt);
        } else{
            p.updateChargePatho(this, 0);
        }
        return p.getChargePourPatho(this);
    }


}