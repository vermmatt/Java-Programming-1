public class Maximum {
    private double een;
    private double twee;
    private double drie;

    public Maximum() {
        System.out.println("Oproep default constructor\n");
    }

    public Maximum(int een, int twee, int drie) {
        this.een = een;
        this.twee = twee;
        this.drie = drie;
        System.out.println("Oproep int constructor\n");
    }

    public Maximum(long een, long twee, long drie) {
        this.een = een;
        this.twee = twee;
        this.drie = drie;
        System.out.println("Oproep long constructor\n");
    }

    public Maximum(double een, double twee, double drie) {
        this.een = een;
        this.twee = twee;
        this.drie = drie;
        System.out.println("Oproep double constructor\n");
    }

    public double max() {
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(int een, int twee, int drie) {
        System.out.println("Oproep int parameters methode");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(long een, long twee, long drie) {
        long max = Math.max(een, Math.max(twee, drie));
        System.out.println("Oproep double parameters methode\n");
        return (double) max;
    }

    public double max(double een, double twee, double drie) {
        double max = Math.max(een, Math.max(twee, drie));
        System.out.println("Oproep long parameters methode\n");
        return max;
    }
}
