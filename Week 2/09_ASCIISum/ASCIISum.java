import java.util.Scanner;

public class ASCIISum {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een regel tekst in: ");
        String str = keyboard.nextLine();
        char character;
        int num;
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            character = str.charAt(i);
            num = character;
            sum += num;
        }
        System.out.println(sum);
    }
}
