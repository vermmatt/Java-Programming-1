import java.util.Random;

public class KaartSpel {
    public static void main(String[] args) {
        String[] kleuren = {"harten", "schoppen", "ruiten", "klaveren"};

        //aanmaken array van kaarten:
        Speelkaart[] kaarten = new Speelkaart[52];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                kaarten[(i * 13) + j] = new Speelkaart(j + 1, kleuren[i]);
            }
        }

        //controle:
        System.out.println("Eerste kaart: " + kaarten[0]);
        System.out.println("Laatste kaart: " + kaarten[51]);
        Random random = new Random();

        //20 willekeurige kaarten:
        System.out.println("20 willekeurige kaarten:");
        for(int i = 0; i < 20; i++) {
            System.out.println("\t" + kaarten[random.nextInt(52)]);
        }
    }
}
