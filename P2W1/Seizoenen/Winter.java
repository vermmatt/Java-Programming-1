package P2W1.Seizoenen;

public class Winter extends Seizoen{
    private int jaar = 2014;
    private String begin = "21 december";

    public Winter() {
    }

    public Winter(int jaar, String begin) {
        this.jaar = jaar;
        this.begin = begin;
    }

    @Override
    public String getBegin() {
        return "In " + jaar + " begint de winter op " + begin;
    }
}
