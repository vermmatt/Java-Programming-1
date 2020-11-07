public class Temperaturen {
    public static final int AANTAL_TEMPERATUREN = 7;
    private double[] temperaturen = new double[AANTAL_TEMPERATUREN];
    private String[] dagen = {
            "Maandag",
            "Dinsdag",
            "Woensdag",
            "Donderdag",
            "Vrijdag",
            "Zaterdag",
            "Zondag"};

    public void voegTemperatuurToe(int index, double temperatuur) {
        temperaturen[index] = temperatuur;
    }

    public String getDag(int index) {
        return dagen[index];
    }

    public double getTemperatuur(int index) {
        return temperaturen[index];
    }

    public double bepaalGemiddeldeTemperatuur() {
        double sum = 0.0;
        for(int i = 0; i < temperaturen.length; i++) {
            sum += temperaturen[i];
        }
        return sum / AANTAL_TEMPERATUREN;
    }
}
