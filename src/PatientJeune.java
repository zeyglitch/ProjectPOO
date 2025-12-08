public class PatientJeune extends Patient{
public void updateIt(){
   for(Pathogene p : pathoEtIt.keySet()){
            Float lt = p.updateChargeInf();
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