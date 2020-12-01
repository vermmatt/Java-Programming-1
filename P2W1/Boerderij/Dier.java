package P2W1.Boerderij;

public class Dier {
    protected String naam;
    protected String geluid;
    protected String voeding;

   Dier(String naam, String geluid, String voeding) {
        this.naam = naam;
        this.geluid = geluid;
        this.voeding = voeding;
    }



    public String getNaam() {
        return naam;
    }

    public String getGeluid() {
        return geluid;
    }

    public String getVoeding() {
        return voeding;
    }

    @Override
    public String toString() {
        return naam + " maakt geluid \"" + geluid + "\" en eet " + voeding;
    }
}
