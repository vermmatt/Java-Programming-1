package P2W1.Seizoenen;
import java.util.Random;

public class TestSeizoenen {
    public static void main(String[] args) {
        Seizoen[] seizoenen = {
                new Lente(), new Zomer(), new Herfst(), new Winter()
        };
        for (Seizoen seizoen : seizoenen) {
            System.out.println(seizoen.getBegin());
        }
        System.out.println();
        System.out.println("Random:");

        Random rand = new Random();

        for(int i = 0; i < 4; i++){
            int nummer = rand.nextInt(4);
            System.out.println(seizoenen[nummer].getBegin());
        }

// Vul hier aan
// zorg voor 4 maal een afdruk van een willekeurige seizoen
    }
}
