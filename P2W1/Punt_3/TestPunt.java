package P2W1.Punt_3;

public class TestPunt {
    public static void main(String[] args) {
        Punt defaultPunt = new Punt();
        System.out.println("Default punt: " + defaultPunt);
        Punt3D defaultPunt3D = new Punt3D();
        System.out.println("Default punt3D: " + defaultPunt3D);
        Punt punt = new Punt(2, 3);
        System.out.println("Punt: " + punt);
        Punt3D punt3D = new Punt3D(4, 5, 6);
        System.out.println("Punt3D: " + punt3D);
        punt3D.setX(1);
        punt3D.setY(2);
        punt3D.setZ(3);
        System.out.println("Nieuwe coordinaten: " + punt3D);
    }
}
