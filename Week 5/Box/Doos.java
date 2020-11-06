public class Doos {
    private String soort;
    private double lengte;
    private double breedte;
    private double hoogte;

    public Doos(String soort, double lengte, double breedte, double hoogte) {
        this.soort = soort;
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public Doos(String soort, double lengte) {
        this.soort = soort;
        this.lengte = lengte;
        this.breedte = lengte;
        this.hoogte = lengte;
    }

    public double oppervlakte() {
        return 2*(lengte*breedte) + 2*(lengte*hoogte) + 2*(breedte*hoogte);
    }

    public double volume() {
        return lengte*breedte*hoogte;
    }

    public double tapeLengte() {
        double tape1 = 2 * (breedte+lengte);
        double tape2 = 2 * (breedte+hoogte);
        double tape3 = 2 * (lengte+hoogte);
        return Math.min(tape1, Math.min(tape2, tape3));
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Soort: ").append(soort).append("\n");
        result.append(String.format("Lengte: %.1fcm", lengte)).append('\n');
        result.append(String.format("Breedte: %.1fcm", breedte)).append('\n');
        result.append(String.format("Hoogte: %.1fcm", hoogte)).append('\n');
        result.append(String.format("Oppervlakte: %.1fcm²", oppervlakte())).append('\n');
        result.append(String.format("Volume: %.1fcm³", volume())).append('\n');
        result.append(String.format("Minimale tapelengte: %.1fcm", tapeLengte())).append('\n');
        return result.toString();
    }
}
