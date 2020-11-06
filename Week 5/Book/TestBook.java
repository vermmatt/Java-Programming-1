public class TestBook {
    public static void main(String args[]) {
        Book b1 = new Book("BARNES & KOLLING", "PROGRAMMEREN IN JAVA MET BLUEJ", 556);
        Book b2 = new Book("LOUIS PAUL BOON", "DE KAPELLEKENSBAAN", 291);
        Book b3 = new Book("JEF GEERAERTS", "DRUGS", 333);

        b1.setOntleend(true);
        b3.setOntleend(true);
        b1.printDetails();
        b2.printDetails();
        b3.printDetails();
    }
}
