package P2W1.Formule1;

public class Tijd {
    private int minuten;
    private int seconden;
    private int duizendsten;

    public Tijd(int min, int sec, int dui) {
        this.minuten = min;
        this.seconden = sec;
        this.duizendsten = dui;
    }

    public int naarInt() {
        return minuten*10000 + seconden*1000 + duizendsten;
    }

    @Override
    public String toString() {
        return minuten + ":" + seconden + ":" + duizendsten;
    }
}
