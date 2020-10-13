import java.util.Scanner;

public class LongToHex {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        long value = 1;
        while (true) {
            if (value == 0) {
                break;
            }
            System.out.print("\nGeef een geheel getal (stop met 0): ");
            value = keyboard.nextLong();
            String hex = Long.toHexString(value);
            System.out.print(hex);
        }
    }
}
