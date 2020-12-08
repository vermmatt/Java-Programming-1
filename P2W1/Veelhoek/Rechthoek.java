package P2W1.Veelhoek;

public class Rechthoek extends Veelhoek{
    private double lengte;
    private double breedte;

    public Rechthoek(String kleur, double lengte, double breedte){
        super(kleur, "Rechthoek");
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public double oppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n    lengte: " +  lengte +
                "\n    breedte: " +  breedte +
                "\n    oppervlakte: " + oppervlakte();
    }

}
