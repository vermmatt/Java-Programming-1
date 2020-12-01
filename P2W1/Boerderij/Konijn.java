package P2W1.Boerderij;

public class Konijn extends Dier {
    private boolean isGraver;

    Konijn(String naam, Boolean graver) {
        super(naam, "Snifsnif", "gras");
        this.isGraver = graver;
    }

    public String toString() {
        return super.toString() + (isGraver ? " en graaft wel" : " en graaft niet");
    }
}
