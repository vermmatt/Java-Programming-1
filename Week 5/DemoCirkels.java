public class DemoCirkels {
    public static void main(String[] args) {
        Cirkels cirkel = new Cirkels(5);
        Cirkels klein = new Cirkels(10, "Rood");
        Cirkels groot = new Cirkels(11, "Blauw");
        System.out.println(cirkel);
        System.out.println(klein);
        System.out.println(groot);
        System.out.printf("Verschil omtrek (rood - blauw): %.2f%n",
                klein.verschilOmtrek(groot));
        System.out.printf("Verschil oppervlakte (blauw - rood): " +
                "%.2f%n", groot.verschilOppervlakte(klein));
    }
}
