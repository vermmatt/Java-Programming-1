package P2W1.Boerderij;

public class Koe extends Dier {
    private int aantalLiterMelkPerDag;

    Koe(String naam, String geluid, String voeding) {
        super(naam, geluid, voeding);
    }

    Koe(String naam, int aantalLiterMelkPerDag) {
        super(naam, "Boeboe", "gras");
        this.aantalLiterMelkPerDag = aantalLiterMelkPerDag;
    }

    public String toString() {
        return super.toString() + " en geeft " + aantalLiterMelkPerDag + " liter melk per dag";
    }
}
