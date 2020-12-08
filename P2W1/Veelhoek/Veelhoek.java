package P2W1.Veelhoek;

public class Veelhoek {
    private String kleur;
    private String soort;

    public Veelhoek(String kleur, String soort) {
        this.kleur = kleur;
        this.soort = soort;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", soort.toUpperCase(), kleur);
    }
}
