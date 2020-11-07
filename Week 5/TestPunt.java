public class TestPunt {
    public static void main(String[] args) {
        Punt puntEen = new Punt();
        Punt puntTwee = new Punt(3, 4);
        System.out.println("Het punt " + puntEen + " heeft een afstand van " +
                puntEen.afstandTotDeOorsprong() + " tot de oorsprong.");
        System.out.println("Het punt " + puntTwee + " heeft een afstand van " +
                puntTwee.afstandTotDeOorsprong() + " tot de oorsprong.");
    }
}