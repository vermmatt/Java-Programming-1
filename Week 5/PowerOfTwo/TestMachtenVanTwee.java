import java.util.Scanner;

public class TestMachtenVanTwee {
    public static void main(String[] args) {
        MachtenVanTwee machtenVanTwee = new MachtenVanTwee();
        int aantal = 0;
        boolean herhaal = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Hoeveel machten van 2 wil je afdrukken (1..%d)?",
                    MachtenVanTwee.getMax());
            if (scanner.hasNextInt()) {
                aantal = scanner.nextInt();
                if (aantal > 0 && aantal <= MachtenVanTwee.getMax()) {
                    herhaal = false;
                }
            }
            scanner.nextLine();
        } while (herhaal);
// maak de tabel
        machtenVanTwee.maakTabel(aantal);
// vul de tabel met de machten van 2
        machtenVanTwee.vulTabel();
// toon de tabel via toString
        System.out.println(machtenVanTwee);
    }
}
