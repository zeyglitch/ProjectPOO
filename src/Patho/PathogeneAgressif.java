public class PathogeneAgressif extends Pathogene {
    public PathogeneAgressif(String nom, float currentChargeInf, float tauxRep, float sensibilite, float resistanceMedm, Patient patient, Traitement traitement) {
        super(nom, type, currentChargeInf, tauxRep, sensibilite, resistanceMedm, patient, traitement);
    }
    @Override
    protected float updateChargeInf() {
        float totAlpham = 0.0f;
        float totDmt = 0.0f;
        for (Medicament med : traitement.getMedicaments()) {
            totAlpham += med.getSensibilite();
            totDmt += med.getcurrentDm();
        }
        return Math.max(0, currentChargeInf + (currentChargeInf*currentChargeInf) * tauxRep - sensibilite * patient.getReactiviteSI() - totAlpham * totDmt *(1-resistanceMedm) );
    }
}
