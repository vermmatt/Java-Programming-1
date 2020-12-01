package P2W1.Seizoenen;

public class Zomer extends Seizoen{
    private int jaar = 2014;
    private String begin = "21 juni";

    public Zomer() {
    }

    public Zomer(int jaar, String begin) {
        this.jaar = jaar;
        this.begin = begin;
    }

    @Override
    public String getBegin() {
        return "In " + jaar + " begint de zomer op " + begin;
    }
}
