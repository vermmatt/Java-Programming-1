package P2W1.Werknemer;

import java.nio.file.WatchEvent;

public class Arbeider extends Werknemer{
    private static final int MAX_UREN_PER_WEEK = 38;
    private int aantalUren;

    public Arbeider(String naam, long nummer, int aantal){
        super(naam, nummer);
        this.aantalUren = aantal;
    }

    @Override
    public double getLoon() {
        double loon = Werknemer.UURLOON * aantalUren;
        if (aantalUren > MAX_UREN_PER_WEEK){
            loon += (aantalUren - MAX_UREN_PER_WEEK) * 0.5 * Werknemer.UURLOON;
        }
        return loon;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLoon €" + getLoon();
    }
}
