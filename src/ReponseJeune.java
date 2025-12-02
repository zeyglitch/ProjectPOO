public class ReponseJeune extends ReponseImmunitaire {

    public float mettreAJourImmunite(Pathogene pathogene) {
       float oddrep = reponseimmuit;
        float newRep = oddrep + (reactSystImmu * sqrt(pathogene.calculerNouvelleValeur())) - (coefFatigue * reactSystImmu);

    }
}
