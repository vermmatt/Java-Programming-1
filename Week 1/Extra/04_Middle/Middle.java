import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = keyboard.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = keyboard.nextInt();
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println("The middle number is: " + num2);
            } else {
                System.out.println("The middle number is: " + num3);
            }
        } else if (num2 < num3) {
            if (num1 < num3) {
                System.out.println("The middle number is: " + num1);
            } else {
                System.out.println("The middle number is: " + num3);
            }
        } else {
            if (num1 < num2) {
                System.out.println("The middle number is: " + num1);
            } else {
                System.out.println("The middle number is: " + num2);
            }
        }
    }
}
