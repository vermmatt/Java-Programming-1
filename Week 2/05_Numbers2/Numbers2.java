import java.util.Scanner;

public class Numbers2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        long MIMIMUM_DEELTAL = 1000000000000L;
        long MINIMUM_DELER = 10000000L;

            System.out.print("Geef een geheel getal van 13 cijfers: ");
            long num1 = keyboard.nextLong();
            if(num1 < MIMIMUM_DEELTAL){
                System.out.print("Dit getal is te klein!");
                return;
            }
            System.out.print("Geef een geheel getal van 8 cijfers: ");
            long num2 = keyboard.nextLong();
            if(num2 < MINIMUM_DELER){
                System.out.println("Dit getal is te klein!");
                return;
            }
            double division = num1 / (double) num2;
            int rounded = (int) division;
            System.out.println("Het quotiënt is " + division);
            System.out.println("Zonder decimalen is dit " + rounded);
        }
    }
