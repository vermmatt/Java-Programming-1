package P2W1.Formule1;

public class Piloten {
    private Piloot[] piloten = {
            new Piloot("Mark Webber", "Red Bull"),
            new Piloot("Sebastian Vettel", "Red Bull"),
            new Piloot("Fernando Alonso", "Ferrari"),
            new Piloot("Felippe Massa", "Ferrari"),
            new Piloot("Kimi Räikkönen", "Lotus"),
            new Piloot("Lewis Hamilton", "Mercedes")
    };

    private Tijd[] tijden = {
            new Tijd(1, 12, 810), new Tijd(1, 12, 328), new Tijd(1, 12, 845),
            new Tijd(1, 13, 516), new Tijd(1, 13, 370), new Tijd(1, 13, 267)
    };

    public Piloten() {
        for (int i = 0; i < piloten.length; i++) {
            piloten[i].setTijd(tijden[i]);
        }
    }

    public void toonPiloten() {
        for (int i = 0; i < piloten.length; i++) {
            System.out.println(piloten[i].toString());
        }
    }

    public Piloot pilootMetSnelsteTijd(){
        int index = 0;
        Piloot piloot = piloten[0];
        Tijd snelsteTijd = piloot.getTijd();
        for(int i = 1; i < piloten.length; i++) {
            Tijd tijd = piloten[i].getTijd();
            if(tijd.naarInt() < snelsteTijd.naarInt()) {
                snelsteTijd = tijd;
                index = i;
            }
        }
        return piloten[index];
    }

    public Piloot pilootMetTraagsteTijd(){
        int index = 0;
        Piloot piloot = piloten[0];
        Tijd snelsteTijd = piloot.getTijd();
        for(int i = 1; i > piloten.length; i++) {
            Tijd tijd = piloten[i].getTijd();
            if(tijd.naarInt() < snelsteTijd.naarInt()) {
                snelsteTijd = tijd;
                index = i;
            }
        }
        return piloten[index];
    }


}
