package P2W1.Punt_4;

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

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString(){
        return String.format("%s z: %d", super.toString(), z);
    }
}
