package pathogene;
import patient.Patient;

public class PathogeneClassique extends Pathogene {
   
    public PathogeneClassique(String nom, TypePatho type, float tauxRep, float sensibilite) {
        super(nom, type, tauxRep, sensibilite);
    }

    public Float updateChargeInf(Patient p){
        float sommeTraitement = p.getTraitementPourPatho(this).getSomme();
        float it = p.getItPourPatho(this);
        float oldLt = p.getChargePourPatho(this);
        float newLt = oldLt + tauxRep*oldLt - sensibilite*it - sommeTraitement;
        if(newLt>0){
            p.updateChargePatho(this, newLt);
        } else{
            p.updateChargePatho(this,0);
        }
        return p.getChargePourPatho(this);
    }

    

}
