package P2W1.Auto;

public class Auto extends Motor{
    private String merknaam;
    private String nummerplaat;
    private Motor motor;

    public Auto(String merknaam, String nummerplaat) {
        motor = new Motor();
        this.merknaam = merknaam;
        this.nummerplaat = nummerplaat;
    }

    public Auto(String merknaam) {
        this(merknaam, "onberkend");
    }

    public Auto(Auto auto) {
        this(auto.merknaam, auto.nummerplaat);
    }

    public void geefGas() {
        motor.verhoogToerental(200);
    }

    public void geefGas(int toeren) {
        motor.verhoogToerental(toeren);
    }

    public void toonToerental() {
        System.out.println(motor.getToerental());
    }

    public void rem() {
        motor.setToerental(0);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Auto auto = (Auto) object;
        return nummerplaat.equals(auto.nummerplaat);
    }

    @Override
    public int hashCode() {
        return nummerplaat.hashCode();
    }

    @Override
    public String toString() {
        return merknaam + " met kenteken " + nummerplaat;
    }



}
