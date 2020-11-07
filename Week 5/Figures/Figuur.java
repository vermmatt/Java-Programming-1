public class Figuur {
    private static int aantal;
    private String soort;
    private String kleur;

    public Figuur(String soort, String kleur) {
        this.soort = soort;
        this.kleur = kleur;
        aantal++;
    }

    public Figuur(String soort) {
        this.soort = soort;
        this.kleur = "zwart";
        aantal++;
    }


    public static int getAantal() {
        return aantal;
    }

    @Override
    public String toString() {
        return String.format("Soor: %s Kleur: %s", soort, kleur);
    }
}
