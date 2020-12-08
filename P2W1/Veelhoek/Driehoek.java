package P2W1.Veelhoek;

public class Driehoek extends Veelhoek {
    private double basis;
    private double hoogte;

    public Driehoek(String kleur, double basis, double hoogte) {
        super(kleur, "Driehoek");
        this.basis = basis;
        this.hoogte = hoogte;
    }

    public double oppervlakte() {
        return basis * hoogte;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n    basis: " +  basis +
                "\n    hoogte: " +  hoogte +
                "\n    oppervlakte: " + oppervlakte();
    }

}
