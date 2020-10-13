import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de breedte de van kerstboom (oneven getal in bereik 13 .. 29: ");
        int num = keyboard.nextInt();
        if (num < 13 || num > 29) {
            num = 13;
        }
        int middle = num / 2;
        for (int i = 0; i <= (num-1)/2; i++) {
            for (int j = 1; j <= middle-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i<4; i++) {
            for (int j = 1; j < middle; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
