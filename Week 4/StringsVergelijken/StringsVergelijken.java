public class StringsVergelijken {
    public static void main(String[] args) {
        String literal = "Jean-Pierre";
        String nieuweReferentie = "Jean-Pierre";
        String nieuwObject = new String("Jean-Pierre");
// Druk het resultaat af van de vergelijking tussen literal en
// nieuweReferentie. Vergelijk met ==
        System.out.println(literal == nieuweReferentie);
// Druk het resultaat af van de vergelijking tussen literal en
// nieuwObject. Vergelijk met ==
        System.out.println(literal == nieuwObject);
// Druk het resultaat af van de vergelijking tussen literal en
// nieuwReferentie. Vergelijk met de equals methode van de klasse String
        System.out.println(literal.equals(nieuweReferentie));
// Druk het resultaat af van de vergelijking tussen literal en nieuwObject
// Vergelijk met de equals methode van de klasse String
        System.out.println(literal.equals(nieuwObject));
    }
}
