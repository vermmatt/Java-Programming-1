public class Cirkels {
    private int straal;
    private String kleur = "Zwart";

    public Cirkels(int straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    public Cirkels(int straal) {
        this.straal = straal;
    }
    public double omtrek() {
        return 2 * Math.PI * straal;
    }

    public double oppervlakte() {
        return Math.PI * straal * straal;
    }

    public double verschilOmtrek(Cirkels andereCirkel) {
        return Math.abs(this.omtrek() - andereCirkel.omtrek());
    }

    public double verschilOppervlakte(Cirkels andereCirkel) {
        return Math.abs(this.oppervlakte() - andereCirkel.oppervlakte());
    }

    public String toString() {
       return String.format("Kleur: %s%nStraal: %d%nOmtrek: %.2f%nOppervlakte: %.2f%n",
                kleur, straal, omtrek(), oppervlakte());
    }

}
