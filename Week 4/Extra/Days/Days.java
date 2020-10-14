import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/09/13
 */
public class Days {
    public static void main(String[] args) {
        Calendar vandaag = new GregorianCalendar();
        Calendar geboortedatum = new GregorianCalendar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef je geboortedatum in de vorm (dd mm jjjj): ");
        int dag = scanner.nextInt();
        int maand = scanner.nextInt();
        int jaar = scanner.nextInt();

        switch(maand) {
            case 1: geboortedatum.set(jaar, Calendar.JANUARY, dag); break;
            case 2: geboortedatum.set(jaar, Calendar.FEBRUARY, dag); break;
            case 3: geboortedatum.set(jaar, Calendar.MARCH, dag); break;
            case 4: geboortedatum.set(jaar, Calendar.APRIL, dag); break;
            case 5: geboortedatum.set(jaar, Calendar.MAY, dag); break;
            case 6: geboortedatum.set(jaar, Calendar.JUNE, dag); break;
            case 7: geboortedatum.set(jaar, Calendar.JULY, dag); break;
            case 8: geboortedatum.set(jaar, Calendar.AUGUST, dag); break;
            case 9: geboortedatum.set(jaar, Calendar.SEPTEMBER, dag); break;
            case 10: geboortedatum.set(jaar, Calendar.OCTOBER, dag); break;
            case 11: geboortedatum.set(jaar, Calendar.NOVEMBER, dag); break;
            case 12: geboortedatum.set(jaar, Calendar.DECEMBER, dag); break;
        }
        // geboortedatum.set(1928, Calendar.MARCH, 13);  --> 31245 op 29 september 2013

        long aantalDagen = (vandaag.getTimeInMillis() - geboortedatum.getTimeInMillis()) / (1000 * 60 * 60 * 24);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMMM yyyy");

        System.out.println("Vandaag is het " + dateFormat.format(new Date()));
        System.out.println("Je leeft nu " + aantalDagen + " dagen");
    }
}
