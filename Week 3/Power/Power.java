import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Van welk getal wens je de machten? ");
        int num = keyboard.nextInt();
        int MAX = 10000;
        int power = 1;
        while (power < MAX) {
            System.out.println(power);
            power *= num;
        }
        System.out.print("Van welk getal wens je de machten? ");
        int num2 = keyboard.nextInt();
        for (int i = 1; i < MAX; i *= num2) {
            System.out.println(i);
        }
    }
}
