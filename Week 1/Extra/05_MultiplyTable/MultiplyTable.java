public class MultiplyTable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%4s", i*j);
            }
            System.out.println();
        }
    }
}
