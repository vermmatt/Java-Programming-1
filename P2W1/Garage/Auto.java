package P2W1.Garage;

public class Auto {
    private String merknaam;
    private Garage garage;

    public Auto(String merknaam) {
        //this.merknaam = merknaam;
        //this.garage = null;
        this(merknaam, null);
    }
    public Auto(Auto auto) {
        this(auto.merknaam, auto.garage);
    }
    public Auto(String merknaam, Garage garage) {
        this.merknaam = merknaam;
        this.garage = garage;
    }

    public Garage getGarage() {
        return garage;
    }

    public String getMerknaam() {
        return merknaam;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public void setMerknaam(String merknaam) {
        this.merknaam = merknaam;
    }

    @Override
    public String toString(){
        return "Auto: " + merknaam + " Garage: " + garage;
    }
}
