package P2W1.Contact;

public class Telefoon {
    private String soort;
    private String nummer;

    public Telefoon(String soort, String nummer) {
        this.soort = soort;
        this.nummer = nummer;
    }

    public String getNummer() {
        return nummer;
    }

    public String getSoort() {
        return soort;
    }

    public boolean isGeldigNummer() {
        int aantalCijfers = nummer.length();
        if(nummer.charAt(0) == '0' && (aantalCijfers == 9 || aantalCijfers == 10)) {
            return true;
        } else {
            return false;
        }
    }
}
