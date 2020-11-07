public class Getallen {
    private int[] getallen;

    public Getallen(int[] deGetallen) {
        getallen = new int[deGetallen.length];
        getallen = deGetallen;
    }

    public String toonGetallen() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < getallen.length; i++) {
            result.append(getallen[i]);
            if(i < getallen.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    public int aantalKeer(int getal) {
        int aantal = 0;
        for(int i = 0; i < getallen.length; i++) {
            if(getal == getallen[i]) {
                aantal++;
            }
        }
        return aantal;
    }
    public boolean isAanwezig(int getal) {
        boolean aanwezig = false;
        for(int i = 0; i < getallen.length; i++) {
            if(getal == getallen[i]) {
                aanwezig = true;
                break;
            }
        }
        return aanwezig;

    }
}
