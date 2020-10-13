import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numDays = 0;
        String[] months = {"januari","februari", "maart", "april", "mei", "juni", "juli", "augustus", "september","oktober","november","december"};
        System.out.print("Geef een maand in in de vorm van een cijfer (1 = januari): ");
        int month = keyboard.nextInt();
        System.out.print("Geef een jaar (met 4 cijfers): ");
        int year = keyboard.nextInt();
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: numDays = 31; break;
            case 4:
            case 6:
            case 9:
            case 11: numDays = 30; break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numDays = 29;
                } else{
                    numDays = 28;
                }
                break;
        }
        System.out.print("In " + year +" heeft "+ months[month-1] + " " + numDays + " dagen.");
    }
}
