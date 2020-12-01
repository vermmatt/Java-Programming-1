package P2W1.Contact;

public class Contact {
    private String naam;
    private Contactgegevens gegevens;

    public Contact(String naam, String email, String telefoon, String gsm) {
        this.naam = naam;
        this.gegevens = new Contactgegevens(email, telefoon, gsm);
    }

    @Override
    public String toString() {
        return naam + "\n" + gegevens.toString();
    }

    public void toonInfo() {
        System.out.println("Naam: " + naam);
        System.out.println("E-mail: " + gegevens.getEmail());
        System.out.println("Tel: " + gegevens.getTelefoon().getNummer());
        System.out.println("Gsm: " + gegevens.getGsm().getNummer());
        // Opmerking: in de twee laatste regels wordt er gezondigd tegen
        // de wet van Demeter: never talk to strangers!
    }
}
