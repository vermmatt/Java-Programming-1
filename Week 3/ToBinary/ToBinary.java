import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Geef een positief geheel getal (stop met 0): ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(num + " in binair is " + Integer.toBinaryString(num));
        }
    }
}
