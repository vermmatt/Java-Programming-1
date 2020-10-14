import java.util.Scanner;

public class VerkeersBelastingDemo {
    public static void main(String[] args) {
        System.out.println("Voer telkens merk, type en fiscaal vermogen in.");
        System.out.println("Stop door voor het merk onmiddellijk <Enter> te geven.");
        Scanner keyboard = new Scanner(System.in);
        String merk;
        do {
            System.out.print("\nGeef het merk in: ");
            merk = keyboard.nextLine();
            if (!merk.isEmpty()) {
                System.out.print("Geef het type in: ");
                String type = keyboard.nextLine();
                System.out.print("Geef fiscaal vermogen: ");
                int vermogen = keyboard.nextInt();
                keyboard.nextLine();
                if (vermogen < 3 ) {
                    System.out.println("De verkeersbelasting kan niet bepaald worden.");
                    return;
                } else {
                    Auto auto = new Auto(merk, type, vermogen);
                    System.out.printf("Voor een %s %s met %spk betaal je €%.2f", merk, type, vermogen, auto.berekenVerkeersbelasting());
                }
            }
        } while (!merk.isEmpty());
    }
}
