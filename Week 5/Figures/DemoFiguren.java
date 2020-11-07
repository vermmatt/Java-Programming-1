public class DemoFiguren {
    public static void main(String[] args) {
        Figuur driehoek = new Figuur("Driehoek");
        Figuur rechthoek = new Figuur("Rechthoek", "Rood");
        Figuur vierkant = new Figuur("Vierkant", "Blauw");
        Figuur ruit = new Figuur("Ruit", "Groen");
        System.out.println(driehoek);
        System.out.println(rechthoek);
        System.out.println(vierkant);
        System.out.println(ruit);
        System.out.println();
        System.out.println("Aantal objecten: " +
                Figuur.getAantal());
    }
}
