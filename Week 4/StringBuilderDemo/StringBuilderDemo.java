import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de maximale waarde in: ");
        while(!keyboard.hasNextInt()) {
            System.out.println("Foutieve waarde, dit is geen getal!");
            return;
        }
        int MAX = keyboard.nextInt();
        System.out.printf("Geef de hoogste getalwaarde in (1..%s): ", MAX);
        while(!keyboard.hasNextInt()) {
            System.out.println("Foutieve waarde, dit is geen getal!");
            return;
        }
        int value = keyboard.nextInt();
        if (value > MAX || value < 1) {
            System.out.printf("Foutieve waarde, dit is geen getal in de range 1..%s!", MAX);
            return;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= value; i++) {
            str.append(" " + i);
        }
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
    }
}
