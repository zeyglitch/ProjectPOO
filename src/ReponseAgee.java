public class ReponseAgee extends ReponseImmunitaire {

    public float mettreAJourImmunite(Pathogene pathogene) {
       float oldrep = reponseimmuit;
        float newRep = oldrep + (reactSystImmu * pathogene.calculerNouvelleValeur()) - (coefFatigue * (reactSystImmu*reactSystImmu));
        return newRep;
    }

}
