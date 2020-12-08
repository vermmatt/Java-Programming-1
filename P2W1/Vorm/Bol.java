package P2W1.Vorm;

public class Bol extends Vorm{
    private int straal;

    public Bol(String kleur, int straal){
        super(kleur);
        this.straal = straal;
    }

    public double oppervlakte() {
        return 4*Math.PI*straal*straal;
    }

    public double volume() {
        return 4/3*Math.PI*Math.pow(straal, 3);
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s, straal: %d  oppervlakte: %.3f  volume: %.3f",
                getKleur(), straal, oppervlakte(), volume());
    }
}
