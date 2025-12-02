public class PathogeneAgressifResisDynamique extends Pathogene implements IResistanceDynamique {
    public PathogeneAgressifResisDynamique(String nom, float chargeL, float tauxRep, float sensibiliteImmuno, float resistanceMedm, float strategyResistance) {
        super(nom, type, chargeL, tauxRep, sensibiliteImmuno, resistanceMedm, strategyResistance);
    }
}