import java.util.Random;

public class Random2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("\n");
        Random eerste = new Random(42);
        Random tweede = new Random(42);
        for (int i = 0; i < 5; i++) {
            System.out.printf("%.2f ", random.nextDouble());
        }
        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s ", eerste.nextInt(42));
            System.out.printf("%s ", tweede.nextInt(42));
        }
    }
}
