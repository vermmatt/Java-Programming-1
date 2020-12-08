package P2W1.Veelhoek;

public class Vierkant extends Veelhoek{
    private double zijde;

    public Vierkant(String kleur, double zijde){
        super(kleur, "Vierkant");
        this.zijde = zijde;
    }

    public double oppervlakte() {
        return zijde * zijde;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n    zijde: " +  zijde +
                "\n    oppervlakte: " + oppervlakte();
    }
}
