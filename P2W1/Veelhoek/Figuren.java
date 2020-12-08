package P2W1.Veelhoek;

public class Figuren{
    private Veelhoek[] lijst;
    private int aantal = 0;

    public Figuren(){
        lijst = new Veelhoek[10];
    }

    public void voegFiguurToe(Veelhoek veelhoek){
        lijst[aantal] = veelhoek;
        aantal++;
    }

    public int getAantal(){
        return aantal;
    }

    public Veelhoek neemFiguurWeg(int index){
        Veelhoek veelhoek = lijst[index];
        System.arraycopy(lijst,index + 1,lijst,0,aantal - index - 1);
        aantal--;
        return veelhoek;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < aantal; i++) {
            string += lijst[i].toString() + "\n";
        }
        return string;
    }
}
