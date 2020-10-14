import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            System.out.print(random.nextInt(6) + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < 6; i++) {
            System.out.print(random.nextBoolean() + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(random.nextDouble() + " ");
        }
    }
}
