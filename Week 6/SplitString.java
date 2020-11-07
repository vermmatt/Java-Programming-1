import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een zin in: ");
        String zin = scanner.nextLine();

        String[] woorden = zin.split(" ");
        for(String woord : woorden) {
            System.out.println(woord);
        }

    }


}
