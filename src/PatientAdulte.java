public class PatientAdulte extends Patient {

    public PatientAdulte(String nom, String prenom, float coefFatigue, float reactiviteSI){
        super(nom, prenom, coefFatigue, reactiviteSI);
    }


    public void updateIt(){
        for(Pathogene p : pathoEtIt.keySet()){
            Float lt = p.updateChargeInf(this);
            Float oldIt = pathoEtIt.get(p);
            Float newIt = oldIt + coefFatigue*lt - reactiviteSI*oldIt;
            if(newIt>0){
                pathoEtIt.replace(p, oldIt, newIt);
            }else {
                pathoEtIt.replace(p, oldIt, 0.0F);
            }
        }
    }
}
