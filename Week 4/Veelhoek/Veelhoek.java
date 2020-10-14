import java.util.Scanner;

public class Veelhoek {
    public static void main(String[] args) {
        Rechthoek rechthoek = new Rechthoek();
        RechthoekigeDriehoek driehoek = new RechthoekigeDriehoek();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de breedte van de rechthoek: ");
        int breedte = keyboard.nextInt();
        System.out.print("Geef de hoogte van de rechthoek: ");
        int hoogte = keyboard.nextInt();
        rechthoek.setBreedte(breedte);
        rechthoek.setHoogte(hoogte);
        System.out.printf("\nRechthoek\nOmtrek: %s\nOppervlakte: %s", rechthoek.omtrek(), rechthoek.oppervlakte());
        System.out.print("\nGeef de basis van de driehoek: ");
        int basis = keyboard.nextInt();
        System.out.print("\nGeef de hoogte van de driehoek: ");
        int hoogte2 = keyboard.nextInt();
        driehoek.setBasis(basis);
        driehoek.setHoogte(hoogte2);
        System.out.printf("\nDriehoek\nOmtrek: %s\nOppervlakte: %s", driehoek.omtrek(), driehoek.oppervlakte());
        System.out.printf("\nOverzicht: Rechthoek: %sx%s    Driehoek: b%s h%s", breedte, hoogte, basis, hoogte2);
    }
}
