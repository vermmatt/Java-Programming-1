import java.util.Scanner;
public class ASCIIValues {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een string in: ");
        String str = keyboard.nextLine();
        char character;
        int num;
        for(int i = 0; i < str.length(); i++){
            character = str.charAt(i);
            num = character;
            System.out.println(character + " heeft een ASCII waarde van " + num);
        }
    }
}
