import java.util.Scanner;

public class TestGetallenInvoer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aantal;
        do {
            System.out.print("\nHoeveel getallen ga je invoeren? (stop met 0): ");
            aantal = scanner.nextInt();
            if (aantal > 0) {
// Maak hier je getallen-object van de klasse GetallenInvoer
                GetallenInvoer getallen = new GetallenInvoer(aantal);
                for (int i = 0; i < aantal; i++) {
                    System.out.printf("Geef getal %2d: ", i + 1);

                    int getal = scanner.nextInt();
                    getallen.voegGetalToe(i, getal);

                }
// Vul hier de nodige System.out.println's aan,
// zie in de uitvoer wat gevraagd wordt
                System.out.printf("De ingevoerde getallen zijn: %s\n", getallen.toonGetallen());
                System.out.printf("De som van de getallen is: %s\n", getallen.som());
                System.out.printf("Het kleinste getalen is: %s\n", getallen.kleinste());
                System.out.printf("Het grootste getalen is: %s", getallen.grootste());

            }
        } while (aantal > 0);
    }
}