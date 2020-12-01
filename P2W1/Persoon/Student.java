package P2W1.Persoon;

public class Student extends Persoon {
    private int studentNummer;

    public Student(int id, String naam, int nummer){
        super(id, naam);
        this.studentNummer = nummer;
    }

    @Override
    public String toString(){
        return String.format("%s %6d", super.toString(), studentNummer);
    }
}
