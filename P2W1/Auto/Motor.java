package P2W1.Auto;

public class Motor {
    private final int MAX_TOERENTAL = 5800;
    private int toerental;

    public Motor() {

    }

    public void verhoogToerental(int toename) {
        if (toerental + toename > MAX_TOERENTAL) {
            toerental = MAX_TOERENTAL;
        } else {
            toerental += toename;
        }
    }

    public void setToerental(int toerental) {
        if (toerental > MAX_TOERENTAL) {
            this.toerental = MAX_TOERENTAL;
        } else {
            this.toerental = toerental;
        }
    }

    public int getToerental() {
        return toerental;
    }
}
