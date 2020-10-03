import java.util.Scanner;
//import java.util.InputMismatchException;

public class Cijfers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef telkens een cijfer in (0..9).");

        System.out.print("Geef het eerste cijfer: ");
        int num1 = keyboard.nextInt();
        System.out.print("Geef het tweede cijfer: ");
        int num2 = keyboard.nextInt();
        System.out.print("Geef het derde cijfer: ");
        int num3 = keyboard.nextInt();
        System.out.print("Geef het vierde cijfer: ");
        int num4 = keyboard.nextInt();

        int getal = num1 * 1000 + num2 * 100 + num3 * 10 + num4;
        System.out.print("Het getal is " + getal);

//        int number = 0;
//        while (true) {
//            try {
//                System.out.print("Geef telkens een cijfer in (0..9).");
//                number = keyboard.nextInt();
//                if( number >= 0 && number <= 9){
//                    break;
//                } else if (number == -1) {
//                    break;
//                }
//                System.out.println("Foutieve Ingave");
//
//            } catch (InputMismatchException e) {
//                System.out.println("You did not enter a Integer.");
//                keyboard.nextLine(); // needed to clear buffer
//            }
//        }
//        System.out.println("You entered: " + number);
    }
}
