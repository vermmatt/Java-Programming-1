public class TestLottogetallen {
    private static final int AANTAL_REEKSEN = 10;
    public static void main(String[] args) {
        Lottogetallen getallen = new Lottogetallen();
        metIntTabel(getallen);
        metToString(getallen);
    }
    private static void metIntTabel(Lottogetallen getallen) {
        System.out.println("Met methode getGetallen (10 reeksen):");
        for (int i = 0; i < AANTAL_REEKSEN; i++) {
            getallen.genereerGetallen();
            int[] tabel = getallen.getGetallen();
            for (int teller = 0; teller < 6; teller++) {
                System.out.printf("%2d ", tabel[teller]);
            }
            System.out.println();
            getallen.reset();
        }
    }
    private static void metToString(Lottogetallen getallen) {
        System.out.println("\n\nMet toString (10 reeksen):");
// Vul hier aan
        for(int i = 0; i < AANTAL_REEKSEN; i++) {
            getallen.genereerGetallen();
            System.out.println(getallen);
            getallen.reset();
        }
    }
}