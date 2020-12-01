package P2W1.SiteBezoek;

import java.util.Random;

public class Tijd {
    private int uren;
    private int minuten;
    private int seconden;
    private int honderdsten;
    private static Random random = new Random();

    public Tijd() {}

    public Tijd(int uren, int minuten, int seconden, int honderdsten) {
        this.uren = uren;
        this.minuten = minuten;
        this.seconden = seconden;
        this.honderdsten = honderdsten;
    }

    public int getUren() {
        return uren;
    }

    public int getMinuten() {
        return minuten;
    }

    public int getSeconden() {
        return seconden;
    }

    public int getHonderdsten() {
        return honderdsten;
    }

    public int toInteger(){
        return honderdsten + seconden * 100 + minuten * 10000 + uren * 1000000;
    }

    @Override
    public String toString(){
        return String.format("%2d:%02d:%02d.%02d", uren, minuten, seconden, honderdsten);
    }

    public void maakRandomTijd(){
        this.uren = random.nextInt(24);
        this.minuten = random.nextInt(60);
        this.seconden = random.nextInt(60);
        this.honderdsten = random.nextInt(100);
    }
}
