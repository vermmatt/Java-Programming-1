import java.util.Scanner;

public class Compound {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double begin = 1;
        double aangroei = 0;
        int jaren = 0;
        double bedrag = 0;
        double dubbel = 0;
        while (true) {
            System.out.print("Geef het bedrag in € (stop met 0): ");
            begin = keyboard.nextDouble();
            if (begin <= 0) {
                break;
            }
            System.out.print("Geef het aangroeipercentage in %: ");
            aangroei = keyboard.nextDouble();
            System.out.print("Geef het aantal jaren: ");
            jaren = keyboard.nextInt();
            bedrag = begin*Math.pow(1+(aangroei/100), jaren);
            System.out.printf("Bij een aangroei van %.0f%% heb je na %d jaren een bedrag van %.0f€\n", aangroei, jaren, bedrag);
            dubbel = Math.log(2)/Math.log(1+(aangroei/100));
            System.out.printf("Het duurt %.0f jaren om het bedrag te verdubbelen\n", dubbel);
        }
    }
}
