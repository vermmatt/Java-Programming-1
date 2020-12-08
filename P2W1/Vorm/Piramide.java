package P2W1.Vorm;

public class Piramide extends Vorm{
    private int zijde;
    private int hoogte;

    public Piramide(String kleur, int zijde, int hoogte){
        super(kleur);
        this.zijde = zijde;
        this.hoogte = hoogte;
    }

    public void setZijde(int zijde) {
        this.zijde = zijde;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public double oppervlakte(){
        return zijde*zijde + 2* zijde * Math.sqrt((zijde/2)*(zijde/2) + hoogte*hoogte);
    }

    public double volume(){
        return (zijde*zijde*hoogte)/3;
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s, zijde: %d, hoogte: %d, oppervlakte: %.3f  volume: %.3f",
                getKleur(), zijde, hoogte, oppervlakte(), volume());
    }
}
