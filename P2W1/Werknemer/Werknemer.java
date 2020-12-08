package P2W1.Werknemer;

public abstract class Werknemer {
    public static final double UURLOON = 12.5;
    private String naam;
    private long rijksregisternummer;

    public Werknemer(String naam, long nummer){
        this.naam = naam;
        this.rijksregisternummer = nummer;
    }

    public abstract double getLoon();

    @Override
    public String toString(){
        return String.format("Naam: %s%nNummer: %d", naam, rijksregisternummer);
    }
}
