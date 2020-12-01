package P2W1.RuimteFiguren;

public class Cilinder extends RuimteFiguur{
    private double diameter;
    private double lengte;

    public Cilinder(String kleur, double diameter, double lengte) {
        super(kleur);
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public Cilinder(double diameter, double lengte) {
        super("zwart");
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public Cilinder() {
        this.diameter = 1.0;
        this.lengte = 1.0;
    }

    public double getDiameter() {
        return diameter;
    }

    public double oppervlakte(){
        double r = diameter/2;
        return 2 * Math.PI * r * (lengte + r);
    }

    public double inhoud(){
        double r = diameter/2;
        return Math.PI * lengte * r;
    }
}
