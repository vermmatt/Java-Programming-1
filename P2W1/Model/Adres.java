package P2W1.Model;

public class Adres {
    private String straat;
    private String gemeente;
    private int postNummer;

    public Adres() {
        this.straat = "";
        this.gemeente = "";
    }

    public void setAdres(String straat, String gemeente, int post){
        this.straat = straat;
        this.gemeente = gemeente;
        this.postNummer = post;
    }

    @Override
    public String toString(){
        if(straat.isEmpty()) {
            return "Adres onbekend";
        } else {
            return "Adres " + straat + " " + postNummer + " " + gemeente;
        }
    }
}
