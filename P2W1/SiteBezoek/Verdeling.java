package P2W1.SiteBezoek;

public class Verdeling {
    private static final int AANTAL = 1000;
    private int[] uren;
    private Tijd[] tijden;

    public Verdeling() {
        uren = new int[24];
        tijden = new Tijd[AANTAL];
    }

    public int[] getUren() {
        return uren;
    }

    public void genereerBezoekersTijden() {
        for(int i = 0; i< tijden.length; i++) {
            tijden[i] = new Tijd();
            tijden[i].maakRandomTijd();
        }
    }

    public void voegBezoekersTijdenToe() {
        for(int i = 0; i < AANTAL; i++) {
            int index = tijden[i].getUren();
            uren[index]++;
        }
    }

    public String toonVerdeling() {
        String string = "";
        for(int i = 1; i < 12; i++) {
           string += String.format("uur %2d: %2d   uur %2d: %2d\n", i, uren[i], i+12, uren[i+12]);
        }
        return string;
    }

    public int getControleTotaal(){
        int som = 0;
        for(int i = 0; i< uren.length; i++) {
            som += uren[i];
        }
        return som;
    }

    public String vroegste() {
        Tijd vroegste = tijden[0];
        for (int i = 1; i < AANTAL; i++) {
            int tijd = tijden[i].toInteger();
            if (tijd < vroegste.toInteger()) {
                vroegste = tijden[i];
            }
        }
        return vroegste.toString();
    }

    public String laatste() {
        Tijd laatste = tijden[0];
        for (int i = 1; i < AANTAL; i++) {
            int tijd = tijden[i].toInteger();
            if (tijd > laatste.toInteger()) {
                laatste = tijden[i];
            }
        }
        return laatste.toString();
    }


}
