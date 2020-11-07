import java.util.Scanner;

public class LettersTellen {
    public static void main(String[] args) {
        int[] teller = new int[26];
        int totaal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Tik een zin in: ");
        String zin = sc.nextLine();
        zin = zin.toLowerCase();
        for(int i =0; i < zin.length(); i++) {
            if(zin.charAt(i) - 97 >= 0) {
                int letter = zin.charAt(i) - 97;
                teller[letter]++;
            }
        }
            for(int i = 0; i < 26; i++) {
                if(i%6 == 0) {
                    System.out.println();
                }
                System.out.printf("%s --> %dx ", (char)(97+i), teller[i]);
            }
        for(int i = 0; i < 26; i++) {
            totaal += teller[i];
        }
        System.out.println("\nTotaal aantal letters: " + totaal);
    }
}
