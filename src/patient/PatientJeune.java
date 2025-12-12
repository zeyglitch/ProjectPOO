package patient;
import pathogene.Pathogene;

public class PatientJeune extends Patient{

    public PatientJeune(String nom, String prenom, float coefFatigue, float reactiviteSI){
        super(nom, prenom, coefFatigue, reactiviteSI);
    }

    public void updateIt(){
        for(Pathogene p : pathoEtIt.keySet()){
            Float lt = p.updateChargeInf(this);
            Float oldIt = pathoEtIt.get(p);
            Float newIt = (float) (oldIt + reactiviteSI*Math.sqrt(lt) + coefFatigue*oldIt);
            if(newIt>0){
                pathoEtIt.replace(p, oldIt, newIt);
            }else {
                pathoEtIt.replace(p, oldIt, 0.0F);
            }
        }
    }
}