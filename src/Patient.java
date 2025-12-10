import java.util.HashMap;

public abstract class Patient {
    protected String nom;
    protected String prenom;
    protected float coefFatigue;
    protected float reactiviteSI;
    protected HashMap<Pathogene, Float> pathoEtIt = new HashMap<>();
    protected HashMap<Pathogene, Float> pathoEtCharge = new HashMap<>();
    protected HashMap<Pathogene, Traitement> pathoEtTrait = new HashMap<>();

    public Patient(String nom, String prenom, float coefFatigue, float reactiviteSI){
        this.nom = nom;
        this.prenom = prenom;
        this.coefFatigue = coefFatigue;
        this.reactiviteSI = reactiviteSI;
    }
    
    public void ajouterPatho(Pathogene p, float it, float charge){
        pathoEtIt.put(p, it);
        pathoEtCharge.put(p, charge);
        pathoEtTrait.put(p, new Traitement());
        getTraitementPourPatho(p).setPathogene(p);
    }

    public Float getItPourPatho(Pathogene p){
        return pathoEtIt.get(p);
    }

    public Float getChargePourPatho(Pathogene p){
        return pathoEtCharge.get(p);
    }


    public Traitement getTraitementPourPatho(Pathogene p){
        return pathoEtTrait.get(p);
    }

    public void updateChargePatho(Pathogene p, float nvCharge){
        pathoEtCharge.replace(p, nvCharge);
    }

    public void ajouterMedPourPatho(Pathogene p, Medicament med, float res, float concMed){
        Traitement traitement = getTraitementPourPatho(p);
        traitement.ajouterMed(med, res, concMed);
    }

    public abstract void updateIt();

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Patient : "+nom +" "+ prenom + " est infecté par : \n");
        for(Pathogene patho: pathoEtIt.keySet()){
            sb.append("- "+patho.toString());
            sb.append(" (It = " + getItPourPatho(patho) + "; Lt = " + getChargePourPatho(patho) +")\n" );
            Traitement traitement = getTraitementPourPatho(patho);
            if(traitement.getMedicaments().size()>0){
                sb.append("\ttraité par les médicaments :");
            }
            for(Medicament m: traitement.getMedicaments()){
                sb.append("\n\t#" + m.toString());
                sb.append(" (Dm = "+ traitement.getCurrentDmForMed(m)+" ; Rm = "+ traitement.getCurrentRmForMed(m)+")");
            }
        }
        return sb.toString();

    }
}
