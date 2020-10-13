import java.util.Scanner;
import java.util.Calendar;

public class DaysSwitch {
    public static void main(String[] args) {
        String[] week = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};
        System.out.print("Geef de naam van een dag (kleine letters): ");
        Scanner keyboard = new Scanner(System.in);
        String day = keyboard.nextLine();
        switch (day) {
            case "maandag":
                System.out.println("dagNummer = 1");
                break;
            case "dinsdag":
                System.out.println("dagNummer = 2");
                break;
            case "woensdag":
                System.out.println("dagNummer = 3");
                break;
            case "donderdag":
                System.out.println("dagNummer = 4");
                break;
            case "vrijdag":
                System.out.println("dagNummer = 5");
                break;
            case "zaterdag":
                System.out.println("dagNummer = 6");
                break;
            case "zondag":
                System.out.println("dagNummer = 7");
                break;
        }
        final int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)-2;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Vandaag is het maandag");
                break;
            case 1:
                System.out.println("Vandaag is het dinsdag");
                break;
            case 2:
                System.out.println("Vandaag is het woensdag");
                break;
            case 3:
                System.out.println("Vandaag is het donderdag");
                break;
            case 4:
                System.out.println("Vandaag is het vrijdag");
                break;
            case 5:
                System.out.println("Vandaag is het zaterdag");
                break;
            case 6:
                System.out.println("Vandaag is het zondag");
                break;

        }
    }
}
