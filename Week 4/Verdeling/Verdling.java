import java.util.Random;

public class VerdelingDemo {
    public static void main(String[] args) {
        int AANTAL = 100;
        Random random = new Random();
        Verdeling verdeling = new Verdeling();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < AANTAL; j++) {
                verdeling.voegWaardeToe(random.nextInt(6));
            }
            System.out.println(verdeling.toonVerdeling());
            System.out.println(verdeling.gemiddeldeWaarde());
        }
    }
}
