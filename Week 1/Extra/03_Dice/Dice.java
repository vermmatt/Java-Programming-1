import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Dice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("How many times do you want to throw? ");
        double times = keyboard.nextInt();
        double i = times;
        int total = 0;
        while (i > 0) {
            int num1 = rand.nextInt(7);
            int num2 = rand.nextInt(7);
            int num3 = rand.nextInt(7);
            int sum = num1 + num2 + num3;
            total = total + sum;
            System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
            i--;
        }
        double avg = Math.round(total*10/times)/10.0;
        System.out.println("Total sum: " + total);
        System.out.println("Average: " + avg);

    }
}
