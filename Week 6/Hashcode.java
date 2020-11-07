import java.util.Random;

public class Hashcode {

    public static void main(String[] args) {
        int MAX = 20;
        int[] getallen = new int[MAX];

        Random generator = new Random();
        //genereer reeks
        for(int i = 0; i < MAX; i++) {
            getallen[i] = generator.nextInt(900) + 100;
        }

        int[] hashcodes = new int[MAX];
        for(int i = 0; i < MAX; i++) {
            hashcodes[i] = getallen[i]%10;
        }

        //output
        for(int i = 0; i < MAX; i++) {
            System.out.printf("%d ", getallen[i]);
        }
        System.out.println();
        for(int i = 0; i < MAX; i++) {
            System.out.printf("%d ", hashcodes[i]);
        }



    }


}
