import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int min = 100000;
        int max = 999999;
        while(true) {
            System.out.print("Geef een geheel getal van 6 cijfers: ");
            long num1 = keyboard.nextLong();
            System.out.print("Geef nog een geheel getal van 6 cijfers: ");
            long num2 = keyboard.nextLong();
            if(num1 >= min && num1 <= max && num2 >= min && num2 <= max) {
                long product = num1 * num2;
                long result = product % 1000000;
                System.out.println("Het product is " + product);
                System.out.println("De laatste 5 cijfers zijn: " + result);
                break;
            } else {
                System.out.println("Een van de twee getallen is te klein.");
            }
        }
    }
}
