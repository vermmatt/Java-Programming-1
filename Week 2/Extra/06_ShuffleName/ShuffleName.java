import java.util.Scanner;
import java.util.Random;


    public class ShuffleName {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Geef je naam: ");
            String naam = scanner.nextLine();

            System.out.print("Hallo " + naam + " je verhaspelde naam is ");

            String verhaspeld = "";
            while (naam.length() != 0) {
                int index = random.nextInt(naam.length());
                char ch = naam.charAt(index);
                naam = naam.substring(0, index) + naam.substring(index + 1);
                if (Character.isAlphabetic(ch)) {
                    verhaspeld += ch;
                }
            }

            System.out.println(verhaspeld);
        }
    }
