package P2W1.Formule1;

public class TestPiloten {
    public static void main(String[] args) {
        Piloten piloten = new Piloten();
        piloten.toonPiloten();
        System.out.println("\nPiloot met snelste tijd:");
        System.out.println(piloten.pilootMetSnelsteTijd());
        System.out.println("\nPiloot met traagste tijd:");
        System.out.println(piloten.pilootMetTraagsteTijd());
    }
}
