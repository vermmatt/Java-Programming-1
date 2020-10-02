import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het BTW percentage in: ");
        double percentage = keyboard.nextDouble();
        System.out.print("Geef het bedrag in €: ");
        double bedrag = keyboard.nextDouble();
        int keuze;

        while (true) {
            System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");
            keuze = keyboard.nextInt();
            if (keuze == 1 || keuze == 2) {
                break;
            }
            System.out.println("Foutieve keuze!");
        }
        if (keuze == 2) {
            double bedragIncl = bedrag * (1 + (percentage / 100));
            System.out.print("€" + bedrag + " + " + percentage + "% BTW = " + "€" + bedragIncl);
        } else {
            double bedragExcl = bedrag / (1+ (percentage / 100));
            System.out.print("€" + bedrag + " + " + percentage + "% BTW = " + "€" + bedragExcl);
        }
    }
}
