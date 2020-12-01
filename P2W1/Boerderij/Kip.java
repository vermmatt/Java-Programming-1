package P2W1.Boerderij;

public class Kip extends Dier {
    private int aantalEierenPerWeek;

    Kip(String naam, int aantalEierenPerWeek) {
        super(naam, "Toktok", "mais");
        this.aantalEierenPerWeek = aantalEierenPerWeek;
    }

    public String toString() {
        return super.toString() + " en legt " + aantalEierenPerWeek + " eieren per week";
    }
}
