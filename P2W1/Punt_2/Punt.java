package P2W1.Punt_2;

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

    @Override
    public String toString(){
        return String.format("(%d,%d)", x, y);
    }
}
