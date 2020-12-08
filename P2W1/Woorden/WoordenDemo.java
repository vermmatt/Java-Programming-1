package P2W1.Woorden;

public class WoordenDemo {
    public static void main(String[] args) {
        Woord[] woorden = {
                new Woord("alfa"),
                new Woord("bravo"),
                new Woord("charlie"),
                new Woord("delta"),
                new Woord("echo")
        };
        System.out.println("Aantal woorden: " + Woord.getAantalWoorden()); // hier aanvullen
        for (Woord woord : woorden) {
            System.out.println(woord.getWoord());
        }
        System.out.println("\nVerglijkingen:");
        Woord woord = new Woord("alfa");
        if (woorden[0].equals(woord)) {
// hier aanvullen
            System.out.println(woorden[0].getWoord() + " = alfa");
        }
        woorden[0] = new Woord("echo");
        woord = new Woord("echo");
        if (woorden[0].equals(woord)) {
// hier aanvullen
            System.out.println(woorden[0].getWoord() + " = echo");
        }
        woorden[1].setWoord("sierra");
        woord = new Woord("sierra");
        if (woorden[1].equals(woord)) {
// hier aanvullen
            System.out.println(woorden[0].getWoord() + " = sierra");
        }
    }
}