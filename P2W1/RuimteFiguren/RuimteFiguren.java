package P2W1.RuimteFiguren;

public class RuimteFiguren extends RuimteFiguur{
    private RuimteFiguur[] figuren;

    public RuimteFiguren() {
        figuren = new RuimteFiguur[5];
        vulTabel();
    }

    private void vulTabel() {
        figuren[0] = new Bol();
        figuren[1] = new Kubus(2.0);
        figuren[2] = new Cilinder("groen", 2.0, 5.0);
        figuren[3] = new Kubus("geel", 3.0);
        figuren[4] = new Bol("rood", 2.0);
    }

    public void toonFiguren(){
        for(RuimteFiguur figuur : figuren){
            figuur.toonFiguur();
        }
    }
}
