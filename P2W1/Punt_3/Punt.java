package P2W1.Punt_3;

public class Punt {
    private int x;
    private int y;

    public Punt(){}

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return String.format("x: %d y: %d", x, y);
    }
}
