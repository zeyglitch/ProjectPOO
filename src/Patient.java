import java.util.Date;
import java.util.HashMap;

public abstract class Patient {
    protected String nom;
    protected String prenom;
    protected Date dateNaissanece;
    protected float coefFatigue;
    protected float reactiviteSI;
    protected HashMap<Pathogene, Float> pathoEtIt = new HashMap<>();

    public Patient(String nom, String prenom, float coefFatigue, float reactiviteSI){
        this.nom = nom;
        this.prenom = prenom;
        this.coefFatigue = coefFatigue;
        this.reactiviteSI = reactiviteSI;
    }
    
    public void ajouterPatho(Pathogene p, Float it){
        pathoEtIt.put(p, it);
    }

    public Float getItPourPatho(Pathogene p){
        return pathoEtIt.get(p);
    }


    public abstract void updateIt();

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Patient : "+nom +" "+ prenom + " est infecté par : \n");
        for(Pathogene patho: pathoEtIt.keySet()){
            sb.append("- "+patho.toString());
            sb.append("\n");
        }
        return sb.toString();

    }
}
