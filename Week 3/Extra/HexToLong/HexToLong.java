import java.util.Scanner;

public class HexToLong {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String hex = "";
        while (true) {
            if (hex.equals("0")) {
                break;
            }
            System.out.print("\nGeef een hexadecimaal getal (stop met 0): ");
            hex = keyboard.nextLine();
            long value = Long.parseLong(hex, 16);
            System.out.print(value);
        }
    }
}
