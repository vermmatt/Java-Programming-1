import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int MAX = 100;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Van welk getal wens je de veelvouden? ");
        int num = keyboard.nextInt();
        int multiple = num;
        while(multiple < MAX) {
            System.out.println(multiple);
            multiple += num;
        }
        System.out.print("Van welk getal wens je de veelvouden? ");
        num = keyboard.nextInt();
        for (int i = num; i < MAX; i+=num) {
            System.out.println(i);
        }
    }
}
