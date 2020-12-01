package P2W1.Contact;

public class Contactgegevens {
    private String eMail;
    private Telefoon telefoon;
    private Telefoon gsm;

    public Contactgegevens(String email, String telefoon, String gsm) {
        this.eMail = email;
        this.telefoon = new Telefoon("vast", telefoon);
        this.gsm = new Telefoon("mobiel", gsm);
    }

    public String getEmail() {
        return eMail;
    }

    public Telefoon getGsm() {
        return gsm;
    }

    public Telefoon getTelefoon() {
        return telefoon;
    }

    @Override
    public String toString() {
        return "E-mail: " + eMail + "\nTel: " + telefoon + "\nGSM: " + gsm;
    }
}
