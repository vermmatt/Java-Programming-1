import java.util.Scanner;

public class Canvas {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het symbool: ");
        String symbol = keyboard.nextLine();
        System.out.print("Geef de lengte (2..60): ");
        int length = keyboard.nextInt();
        System.out.print("Geef de breedte (2..20) :");
        int width = keyboard.nextInt();
        for (int i = 0; i < width; i++) {
            System.out.print(symbol);
        }
        System.out.print("\n");
        for (int i = 1; i < length - 1; i++) {
            System.out.print(symbol);
            for (int j = 0; j < width-2; j++){
                System.out.print(" ");
            }
            System.out.print(symbol + "\n");
        }
        for (int i = 0; i < width; i++) {
            System.out.print(symbol);
        }
    }
