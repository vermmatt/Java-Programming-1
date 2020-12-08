package P2W1.Werknemer;

public class Bediende extends Werknemer{
    private static final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, long nummer, double barema){
        super(naam, nummer);
        this.weddeBarema = barema;
    }

    @Override
    public double getLoon() {
        return Werknemer.UURLOON * LOONFACTOR * weddeBarema;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLoon €" + getLoon();
    }
}
