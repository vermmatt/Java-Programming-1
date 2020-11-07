import java.util.Random;
import java.util.Scanner;


public class SpeelKaarten {
    public static void main(String[] args) {
        String[] kleuren = {
                "Harten", "Schoppen", "Ruiten", "Klaveren"
        };
        String[] waarden = {
                "Aas", "Twee", "Drie", "Vier", "Vijf",
                "Zes", "Zeven", "Acht", "Negen", "Tien",
                "Boer", "Dame", "Heer"
        };
// Vul hier aan
        Random rand = new Random();
        Scanner keyboard  = new Scanner(System.in);
        int aantal;
        System.out.print("Hoeveel kaarten wens je (1..5): ");
        if(keyboard.hasNextInt()) {
            aantal = keyboard.nextInt();
            if(aantal > 0 && aantal < 6) {
                for(int i = 0; i < aantal; i++) {
                    System.out.printf("%s %s%n",
                            kleuren[rand.nextInt(4)],
                            waarden[rand.nextInt(13)]);
                }
            } else {
                System.out.println("Dit is geen geldige waarde!");
            }
        } else {
            System.out.println("Dit is geen geldige waarde!");
        }
    }
}
