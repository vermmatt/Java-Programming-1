import java.util.Scanner;

public class NumbersGrid {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een getal (1..30) stop met 0: ");
        int num = keyboard.nextInt();
        if  (num == 0) {
            return;
        } else if (num > 30 || num <= 1) {
            System.out.println("Het getal moet in het bereik 1..30 liggen!");
        } else {
            for (int i = 1; i<= num*4 + 1; i++) {
                System.out.print("-");
            }
            for (int i = 1; i <= num; i++) {
                System.out.print("\n|");
                for (int j = 1; j <= num; j++) {
                    System.out.printf("%3s|", i*j);
                }
            }
        }
    }
}
