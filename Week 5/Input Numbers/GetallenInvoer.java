import java.util.Arrays;

public class GetallenInvoer {
    private int[] getallen;

    public GetallenInvoer(int aantal) {
        getallen = new int[aantal];
    }

    public void voegGetalToe(int plaats, int getal) {
        getallen[plaats] = getal;
    }

    public int som() {
        int som = 0;
        for(int i : getallen) {
            som += i;
        }
        return som;
    }

    public int kleinste() {
        int min = getallen[0];
        for(int i = 1; i < getallen.length; i++) {
            if(getallen[i]<min) {
                min = getallen[i];
            }
        }
        return min;
    }

    public int grootste() {
        int max = getallen[0];
        for(int i = 1; i < getallen.length; i++) {
            if(getallen[i]>max) {
                max = getallen[i];
            }
        }
        return max;
    }

    public String toonGetallen() {
        StringBuilder result = new StringBuilder();
        for(int i =0; i< getallen.length-1; i++) {
            result.append(getallen[i]);
            result.append(", ");
        }
        result.append(getallen[getallen.length-1]);
        return result.toString();
    };

}
