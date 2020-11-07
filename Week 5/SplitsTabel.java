public class SplitsTabel {
    public static void main(String[] args) {
        int[] tabel = {
                14, 18, 31, 84, 57, 61, 27, 90, 55, 21,
                30, 15, 43, 42, 19, 20, 69, 54, 35, 18
        };
        int helft = tabel.length / 2;
// Vul hier aan
        for(int i = 0; i < helft; i++) {
            System.out.printf("%-2d  ", tabel[i]);
        }
        System.out.print("\n");
        for(int i = helft; i < tabel.length; i++) {
            System.out.printf("%-2d  ", tabel[i]);
        }
        System.out.print("\n");
        System.out.print("-".repeat(39));
        System.out.print("\n");
        for(int i = 0; i < helft; i++) {
            System.out.printf("%d  ", tabel[i]+tabel[helft+i]);
        }
    }
}