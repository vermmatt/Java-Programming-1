import java.util.Scanner;

public class Consumption {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de vorige kilometerstand: ");
        int vorigeStand = keyboard.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        int huidigeStand = keyboard.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        double literGetankt = keyboard.nextDouble();
        int afstand = huidigeStand - vorigeStand;
        double verbruik = (literGetankt/afstand) * 100.0);
        System.out.print("Verbruik voor " + afstand + "km: " + String.format("%.1f", verbruik) + " liter/100km");
    }
}
