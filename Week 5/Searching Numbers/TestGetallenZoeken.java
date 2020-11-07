import java.util.Scanner;

public class TestGetallenZoeken {
    public static void main(String[] args) {
        int[] tabel = {16, 14, 19, 18, 4, 10, 2, 3, 12, 17, 14,
                12, 4, 10, 10, 16, 12, 10, 12, 20};
        Getallen getallen = new Getallen(tabel);
        System.out.println("Getallen: " + getallen.toonGetallen());
        System.out.println("\nGetal " + 12 + " komt " +
                getallen.aantalKeer(12) + " keer voor.");
        System.out.println("Getal " + 20 + " komt " +
                getallen.aantalKeer(20) + " keer voor.");
        System.out.println("Getal " + 13 + " komt " +
                getallen.aantalKeer(13) + " keer voor.\n");
        Scanner scanner = new Scanner(System.in);
        int getal;
        do {
            System.out.print("Welk getal wil je zoeken? (stop met -1): ");
            getal = scanner.nextInt();
            if (getal >= 0) {
                System.out.print("Het getal " + getal + " komt");
                if (!getallen.isAanwezig(getal)) {
                    System.out.print(" NIET");
                }
                System.out.println(" voor in de tabel");
            }
        } while (getal >= 0);
    }
}
