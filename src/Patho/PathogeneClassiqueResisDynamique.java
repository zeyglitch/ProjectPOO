public class PathogeneClassiqueResisDynamique extends Pathogene implements IResistanceDynamique {
    public PathogeneClassiqueResisDynamique(String nom, float chargeL, float tauxRep, float sensibiliteImmuno, float resistanceMedm, float strategyResistance) {
        super(nom, type, chargeL, tauxRep, sensibiliteImmuno, resistanceMedm, strategyResistance);
    }
}