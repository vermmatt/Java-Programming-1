import java.util.Scanner;

public class Temperaturen {
    public static void main(String[] args) {
        int AANTAL_TEMPERATUREN = 7;
        double[] temperaturen = new double[AANTAL_TEMPERATUREN];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de 7 temperaturen:\n");
//input
        for(int i = 0; i < AANTAL_TEMPERATUREN; i++) {
            System.out.print("Dag " + (i+1) + ": ");
            temperaturen[i] = scanner.nextDouble();
        }
        int som = 0;
        for(int i = 0; i < AANTAL_TEMPERATUREN; i++) {
            som += temperaturen[i];
        }
        double gemiddelde = (double) som / temperaturen.length;
//output
        System.out.print("\nOverzicht:\n");
        System.out.println("=".repeat(18));
        for(int i = 0; i < AANTAL_TEMPERATUREN; i++) {
            System.out.printf("Dag %d: %10.1f%n", (i+1), temperaturen[i]);
        }
        System.out.println("=".repeat(18));
        System.out.printf("Gemiddelde: %.2f", gemiddelde);
    }
}
