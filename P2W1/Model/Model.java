package P2W1.Model;

public class Model {
    private String naam;
    private Adres adres;
    private Maten maten;

    public Model(String naam){
        this.naam = naam;
        this.adres = new Adres();
        this.maten = new Maten();
    }

    public Model(String naam, int borst, int taille, int heup){
        this.naam = naam;
        this.maten = new Maten(borst, taille, heup);
        this.adres = new Adres();
    }

    public String getNaam() {
        return naam;
    }

    public void setAdres(String straat, int post, String gemeente) {
        adres.setAdres(straat, gemeente, post);
    }

    @Override
    public String toString(){
        return naam + "\n" + adres + "\n" + maten;
    }
}
