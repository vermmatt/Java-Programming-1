import java.util.Scanner;

public class WoordDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Woord woord;
        System.out.print("\nGeef een woord: ");
        String string = keyboard.nextLine();
        woord = new Woord(string);
        System.out.printf("\nJe gaf '%s' in.", woord.getWoord());
        System.out.printf("\nDit woord heeft %s letters.", woord.aantalLetters());
        System.out.printf("\nHet woord in met eerste letter een hoofdletter: %s", woord.eersteLetterNaarHoofdletter());
        System.out.printf("\nHet woord in hoofdletters: %s", woord.naarHoofdletters());
    }
}
