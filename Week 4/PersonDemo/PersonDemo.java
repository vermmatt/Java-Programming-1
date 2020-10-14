import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.print("Geef de naam: ");
        String name = keyboard.nextLine();
        System.out.print("Geef de leeftijd: ");
        int age = keyboard.nextInt();
        Persoon p1 = new Persoon(name, age);
        System.out.println(p1.getNaam());
        System.out.println(p1.getLeeftijd());
        p1.setLeeftijd(42);
        System.out.println(p1.getLeeftijd());
        p1.setNaam("Janos");
        System.out.println(p1.getNaam());
    }
}
