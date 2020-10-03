import java.util.Scanner;

public class Pizza {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int PRIJS_PIZZA = 800;
        int PRIJS_TOPPING = 50;
        double totaal = 0;
        System.out.print("Hoeveel pizza's wens je: ");
        int pizza = keyboard.nextInt();
        int topping;
        totaal += (pizza * PRIJS_PIZZA);
        for(int i = 1; i <= pizza; i++){
            System.out.print("Hoeveel extra toppings voor pizza " + i +": ");
            topping = keyboard.nextInt();
            totaal += (topping * PRIJS_TOPPING);
        }
        System.out.println("Te betalen: €" + totaal/100);
    }
}
