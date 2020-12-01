package P2W1.Seizoenen;

public class Herfst extends Seizoen{
    private int jaar = 2014;
    private String begin = "23 september";

    public Herfst() {
    }

    public Herfst(int jaar, String begin) {
        this.jaar = jaar;
        this.begin = begin;
    }

    @Override
    public String getBegin() {
        return "In " + jaar + " begint de herfst op " + begin;
    }
}
