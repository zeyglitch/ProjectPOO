public class PathogeneClassiqueResDyn extends Pathogene implements IResistanceDynamique{
    public PathogeneClassiqueResDyn(String nom, TypePatho type, float currentChargeInf, float tauxRep, float sensibilite, Patient patient) {
        super(nom, type, currentChargeInf, tauxRep, sensibilite, patient);
    }

    public float calculerNouvelleResistance(Medicament m){
        return 0.0F;
    }

    public Float updateChargeInf(){
        float sommeTraitement = 0;
        if(traitement!=null){
            sommeTraitement = traitement.getSomme();
        }
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