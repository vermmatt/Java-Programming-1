public class Kwadraten {
    public static void main(String[] args) {
        int[] tabel = new int[10];

        for(int i = 1; i <= 10; i++) {
            tabel[i-1] = (int) Math.pow(i,2);
            System.out.printf("%d ", tabel[i-1]);
        }

    }
}
