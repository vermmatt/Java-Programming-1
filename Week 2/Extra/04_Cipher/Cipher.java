import java.util.Scanner;
public class Cipher {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een bericht: ");
        String str = keyboard.nextLine();
        str = str.toUpperCase();
        String code = "";
        String decode = "";
        char character;
        int num;
        int diff;
        //encode
        for(int i = 0; i < str.length(); i++){
            character = str.charAt(i);
            num = character+6;
            diff = num - 90;
            if(diff > 0){
                num = 64 + diff;
                code = code + (char)num;
            } else if(character == 32){
                code = code + " ";
            } else{
                code = code + (char)num;
            }
        }
        System.out.println(code);
        //decode
        for(int i = 0; i < code.length(); i++){
            character = code.charAt(i);
            num = character-6;
            diff = num - 65;
            if(diff < 0 && character != 32){
                num = 91 + diff;
                decode = decode + (char)num;
            } else if(character == 32){
                decode = decode + character;
            } else{
                decode = decode + (char)num;
            }
        }
        System.out.println(decode);
    }
}
