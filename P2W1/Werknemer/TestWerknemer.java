package P2W1.Werknemer;

public class TestWerknemer {
    public static void main(String[] args) {
        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };
// vul hier aan
        double som = 0;
        for (Werknemer werknemer : werknemers){
            som += werknemer.getLoon();
            System.out.println(werknemer + "\n");
        };
        System.out.println("Som lonen: €" + som);
    }
}
