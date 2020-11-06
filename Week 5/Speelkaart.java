public class Speelkaart {
    private int waarde;
    private String kleur;

    public Speelkaart(int waarde, String kleur) {
        this.waarde = waarde;
        this.kleur = kleur;
    }

    public int getWaarde() {
        return waarde;
    }

    public String getKleur() {
        return kleur;
    }

    public String toString() {
        switch(waarde) {
            case 1: return kleur + " aas";
            case 11: return kleur + " boer";
            case 12: return kleur + " dame";
            case 13: return kleur + " heer";
            default: return kleur + " " + waarde;
        }
    }
}
