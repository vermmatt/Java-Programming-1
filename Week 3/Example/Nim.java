import java.util.Scanner;
import java.util.Random;

public class Nim {
    public static void main(String[] args) {
        int startAantal = 21;
        int maxAantal = 3;
        int aantal = startAantal;
        int aantalBeurt;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        boolean spelerAanZet = random.nextBoolean();
        do {
            if (spelerAanZet) { //player aan de beurt
                do {
                    System.out.print("Er zijn nog " + aantal + " lucifers. Hoeveel neem jij er? ");
                    aantalBeurt = keyboard.nextInt();
                } while (aantalBeurt < 1 || aantalBeurt > 3);
            } else { // computer aan de beurt
                aantalBeurt = (aantal - 1) % (maxAantal + 1);
                if (aantalBeurt == 0) {
                    aantalBeurt = 1;
                }
            }
            aantal -= aantalBeurt;
            spelerAanZet = !spelerAanZet;
        } while (aantal > 1);
        System.out.println(spelerAanZet?"De computer wint":"Jij wint!");
    }
}
