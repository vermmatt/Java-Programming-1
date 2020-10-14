import java.util.Scanner;

public class OprachtString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een zin in: ");
        String str = keyboard.nextLine();
        System.out.printf("\nDeze zin heeft een lengte van %s karakters.\n", str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(0, str.length()/2));
        System.out.println(str.replace('o', '_'));
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll("[AaEeIiOoUu]", ""));
    }
}
