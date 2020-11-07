import java.util.Random;

public class Lottogetallen {
    private static final Random generator = new Random();
    private static final int MAX = 45;
    private boolean[] getallen;

    public Lottogetallen() {
        getallen = new boolean[MAX];
    }

    public void reset() {
        for(int i = 0; i < getallen.length; i++) {
            getallen[i] = false;
        }
    }

    public void genereerGetallen() {
        int count = 0;
        do {
            int getal = generator.nextInt(MAX);
            if(!getallen[getal]) {
                getallen[getal] = true;
                count++;
            }
        } while(count < 6);
    }

    public int[] getGetallen() {
        int[] result = new int[6];
        int getal = 0;
        for(int i = 0; i < MAX; i++) {
            if(getallen[i]) {
                result[getal++] = i + 1;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < MAX; i++) {
            if(getallen[i]) {
                result.append(String.format("%2d ", (i + 1)));
            }
        }
        return result.toString();
    }
}
