import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Geef een woord in: ");
        String text = keyboard.nextLine();
        StringBuilder sb = new StringBuilder(text);
        StringBuilder reverse = sb.reverse();
        if (text.equals(reverse.toString())) {
            System.out.println("Het woord " + text + " is palindroom");
        } else {
            System.out.println("Het woord " + text + " is niet palindroom");
        }
    }
}
