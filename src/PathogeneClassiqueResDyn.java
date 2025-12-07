public class PathogeneClassiqueResDyn extends Pathogene implements IResistanceDynamique{
    public PathogeneClassiqueResDyn(String nom, TypePatho type, float currentChargeInf, float tauxRep, float sensibilite, float resistanceMedm, Patient patient) {
        super(nom, type, currentChargeInf, tauxRep, sensibilite, resistanceMedm, patient);
    }

    public float calculerNouvelleResistance(Medicament m){
        return 0.0F;
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