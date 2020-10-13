import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nGeef de eerste deler (stop met 0): ");
            int num1 = sc.nextInt();
            if (num1 == 0) {
                break;
            }
            System.out.print("Geef de tweede deler: ");
            int num2 = sc.nextInt();
            int j = 1;
            for (int i = 2; i<1000; i++ ) {
                if (i % num1 == 0 && i % num2 == 0) {
                    if (j < 10) {
                        System.out.printf("%5s", i);
                        j++;
                    } else {
                        System.out.printf("%5s\n", i);
                        j = 1;
                    }
                }
            }
        }
    }
}
