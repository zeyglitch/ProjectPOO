
import java.util.Date;
import java.util.HashMap;

public abstract class Patient {
protected String nom;
    protected String prenom;
    protected Date dateNaissanece;
    protected float coefFatigue;
    protected float reactiviteSI;

    protected HashMap<Pathogene, Float> pathoEtIt = new HashMap<>();
    
    public void ajouterPatho(Pathogene p, Float it){
        pathoEtIt.put(p, it);
    }

    public Float getItPourPatho(Pathogene p){
        return pathoEtIt.get(p);
    }

    public abstract void updateIt();
}


