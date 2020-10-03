import java.util.Scanner;

public class Digits2 {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner keyboard = new Scanner(System.in);


        while(true) {
            System.out.print("Geef een geheel getal: ");
            number = keyboard.nextInt();
            if(number > 0){
                while(number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                System.out.println("De som van de afzonderlijke cijfers is " + sum);
                sum = 0;
                } else if (number == -1) {
                    return;
                } else {
                System.out.println("Getal valt niet binnnen de range.");
            }
        }

    }
}
