import java.util.Scanner;

public class TestVerkoper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Vraag de naam van de verkoper en lees hem in
        System.out.println("Geef de naam van de verkoper: ");
        String naam = scanner.nextLine();
        Verkoper verkoper = new Verkoper(naam);
// Maak een tabel waarin je 12 gehele getallen kunt opslaan
        int[] cijfers = new int[12];
// Gebruik een lus om de verkoopcijfers te laten ingeven
        for(int i = 1; i <= 12; i++) {
            System.out.printf("Geef de verkoopcifers van maand %d: ", i);
            int cijfer = scanner.nextInt();
            cijfers[i-1] = cijfer;
        }
        verkoper.setVerkoopCijfers(cijfers);

// Gebruik de toString methode om de gewenste afdruk te geven
        System.out.println("Verkoopcijfers van Jos: " + verkoper);
        System.out.println("Totaal: " + verkoper.verkoopTotaal());
    }
}
