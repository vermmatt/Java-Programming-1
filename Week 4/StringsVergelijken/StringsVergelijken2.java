import java.util.Scanner;

public class StringsVergelijken2 {
    public static void main(String[] args) {
        String stringEen;
        String stringTwee;
// Lees hier de strings in
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de eerste string: ");
        stringEen = keyboard.nextLine();
        System.out.print("Geef de tweede string: ");
        stringTwee = keyboard.nextLine();
// Trim hier de strings
        stringEen = stringEen.replaceAll("\\s+","");
        stringTwee = stringTwee.replaceAll("\\s+","");
// Vergelijk hier de string en druk ze in de juiste volgorde af
        if (stringEen.compareTo(stringTwee) <= 0) {
            System.out.printf("\n%s %s", stringEen, stringTwee);
        } else {
            System.out.printf("\n%s %s", stringTwee, stringEen);
        }
    }
}
