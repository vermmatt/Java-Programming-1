package P2W1.Woorden;

public class Woord {
    private static int aantalWoorden = 0;
    private String woord;

    public Woord(String woord) {
        this.woord = woord;
        aantalWoorden++;
    }

    public static int getAantalWoorden() {
        return aantalWoorden;
    }

    public String getWoord() {
        return woord;
    }

    public void setWoord(String woord) {
        this.woord = woord;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Woord woord1 = (Woord) object;

        return woord.equals(woord1.woord);
    }

    @Override
    public int hashCode() {
        return woord.hashCode();
    }


}
