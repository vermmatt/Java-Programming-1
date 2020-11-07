import java.util.Calendar;

public class Weekdagen {
    public static void main(String[] args) {
        String[] weekdagen = {
                "maandag",
                "dinsdag",
                "woensdag",
                "donderdag",
                "vrijdag",
                "zaterdag",
                "zondag"
        };
        int dagVanDeWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        if(dagVanDeWeek > 1) {
            dagVanDeWeek--;
        } else {
            dagVanDeWeek = 7;
        }
        System.out.println("Vandaag is het " + weekdagen[dagVanDeWeek-1]);
    }
}
