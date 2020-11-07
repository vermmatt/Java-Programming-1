import java.util.Scanner;

public class Ascii {
    public static void main(String args[]) {
        boolean stop = false;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Geef een woord in (stop met <ENTER>): ");
            String word = keyboard.nextLine();
            if(!word.isEmpty()) {
                char[] letters = word.toCharArray();
                for(char ch : letters) {
                    System.out.printf("%d ", (int) ch);
                }
                System.out.println();
            } else {
                stop = true;
            }
        } while(!stop);

    }

}
