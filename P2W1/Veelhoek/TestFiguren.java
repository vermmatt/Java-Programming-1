package P2W1.Veelhoek;

public class TestFiguren {
    public static void main(String[] args) {
        Figuren figuren = new Figuren();
//getAantal testen:
        System.out.println("Aantal voor toevoegen: " + figuren.getAantal());
//toevoegen testen:
        figuren.voegFiguurToe(new Driehoek("rood", 6, 4));
        figuren.voegFiguurToe(new Rechthoek("blauw", 5, 10));
        figuren.voegFiguurToe(new Vierkant("geel", 8));
        figuren.voegFiguurToe(new Driehoek("zwart", 2, 8));
//getAantal opnieuw testen:
        System.out.println("Aantal na toevoegen: " + figuren.getAantal());
//We nemen er de derde uit:
        Veelhoek derde = figuren.neemFiguurWeg(2);
        System.out.println("\nDe derde veelhoek is:\n" + derde.toString());
//getAantal opnieuw testen:
        System.out.println("Aantal na wegnemen: " + figuren.getAantal());
//toString testen:
        System.out.println("\nAlle figuren:\n" + figuren.toString());
    }
}
