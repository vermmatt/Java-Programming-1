package P2W1.Model;

public class Maten {
    private int borstOmtrek;
    private int taille;
    private int heupOmtrek;

    public Maten() {
        this.borstOmtrek = 90;
        this.taille = 60;
        this.heupOmtrek = 90;
    }

    public Maten(int borst, int taille, int heup){
        this.borstOmtrek = borst;
        this.taille = taille;
        this.heupOmtrek = heup;
    }

    @Override
    public String toString(){
        return "Maten: " + borstOmtrek + " " + taille + " " + heupOmtrek;
    }

}
