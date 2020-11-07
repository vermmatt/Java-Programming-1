public class Verkoper {
    private String naam;
    private int[] verkoopCijfers = new int[12];

    public Verkoper(String naam) {
        this.naam = naam;
    }

    public void setVerkoopCijfers(int[] verkoopCijfers) {
        this.verkoopCijfers = verkoopCijfers;
    }

    public int verkoopTotaal() {
        int sum = 0;
        for(int i = 0; i < verkoopCijfers.length; i++) {
            sum += verkoopCijfers[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < verkoopCijfers.length; i++) {
            builder.append(verkoopCijfers[i] + " ");
        }
        return builder.toString();
    }
}
