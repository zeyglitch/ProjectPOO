public class PathogeneClassique extends Pathogene {
   
    public PathogeneClassique(String nom, TypePatho type, float currentChargeInf, float tauxRep, float sensibilite, float resistanceMedm, Patient patient) {
        super(nom, type, currentChargeInf, tauxRep, sensibilite, resistanceMedm, patient);
    }

    public Float updateChargeInf(){
        float sommeTraitement = traitement.getSomme();
        float it = patient.getItPourPatho(this);
        float oldLt = currentChargeInf;
        float newLt = oldLt + tauxRep*oldLt - sensibilite*it - sommeTraitement;
        if(newLt>0){
            currentChargeInf = newLt;
        } else{
            currentChargeInf = 0;
        }
        return currentChargeInf;
    }
}
