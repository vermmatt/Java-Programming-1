import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hoeveel woorden ga je intikken? ");
        int aantal = scanner.nextInt();
        scanner.nextLine(); //enter weglezen

        String[] array = new String[aantal];

        for(int i = 0; i < aantal; i++) {
            System.out.print("Woord " + (i+1) + ": ");
            array[i] = scanner.nextLine();
        }

        int kortste = 10;
        String kortstewoord = "";
        int langste = 10;
        String langstewoord= "";
        for(String woord : array) {
            if(woord.length() < kortste) {
                kortste = woord.length();
                kortstewoord = woord;
            } else if(woord.length() > langste) {
                langste = woord.length();
                langstewoord = woord;
            }
        }
        System.out.println("kortste woord: " + kortstewoord);
        System.out.println("langste woord: " + langstewoord);



    }
}
