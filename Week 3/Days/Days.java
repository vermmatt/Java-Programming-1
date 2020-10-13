import java.util.Scanner;
import java.util.Calendar;

public class Days {
    public static void main(String[] args) {
        String[] week = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};
        System.out.print("Geef de naam van een dag (kleine letters): ");
        Scanner keyboard = new Scanner(System.in);
        int index = 0;
        String day = keyboard.nextLine();
        for (int i = 0; i<7; i++) {
            if (week[i].equals(day)) {
                index = i;
                break;
            }
        }
        System.out.println("dagNummer = " + (index+1));
        final int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        System.out.println("Vandaag is het " + week[(dayOfWeek-1)]);
    }
}
