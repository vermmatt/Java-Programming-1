package P2W1.Boerderij;

public class Boerderij {
    private static final int MAX = 10;
    private Dier[] dieren = new Dier[MAX];
    private int aantalDieren;

    Boerderij() {

    }

    public void voegDierToe(Dier dier) {
        if (aantalDieren < 10) {
            dieren[aantalDieren++] = dier;
        }
    }

    public void toonDieren() {
        for (int i = 0; i < aantalDieren; i++) {
            if(dieren[i] != null) {
                System.out.println(dieren[i]);
            }
        }
    }
    public void toonGeluiden() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i].getNaam() + " maakt geluid " + dieren[i].getGeluid());
        }
    }

    public void toonVoeding() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i].getNaam() + " eet " + dieren[i].getVoeding());
        }
    }

    public boolean zoekDierOpNaam(String naam) {
        for(int i = 0; i < aantalDieren; i++) {
            if (dieren[i].getNaam().equalsIgnoreCase(naam)) {
                return true;
            }
        }
        return false;
    }



}
