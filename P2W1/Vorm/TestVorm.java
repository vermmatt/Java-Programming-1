package P2W1.Vorm;

public class TestVorm {
    public static void main(String[] args) {
        Bol bol = new Bol("rood", 10);
        Bol knikker = new Bol("blauw", 1);
        Piramide piramide = new Piramide("groen", 10, 12);
        Piramide artifact = new Piramide("geel", 1, 1);
        System.out.println("bol = " + bol);
        System.out.println("knikker = " + knikker);
        System.out.println("piramide = " + piramide);
        System.out.println("artifact = " + artifact);
        artifact.setKleur("orange");
        artifact.setZijde(2);
        artifact.setHoogte(2);
        System.out.println("Na wijzigen kleur.");
        System.out.println("artifact = " + artifact);
    }
}
