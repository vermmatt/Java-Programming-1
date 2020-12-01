package P2W1.Punt_2;

public class Punt3D extends Punt {
    private int z;

    public Punt3D(){}

    public Punt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString(){
        return String.format("(%d,%d,%d)", getX(), getY(), z);
    }
}
