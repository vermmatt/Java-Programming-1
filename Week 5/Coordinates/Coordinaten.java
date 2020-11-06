public class Coordinaten {
    private int GROOTTE = 6;
    private int[][] matrix;
    private int teller;

    public Coordinaten() {
        matrix = new int[GROOTTE][GROOTTE];
    }

    public int getTeller() {
        return teller;
    }

    public void markeerCoordinaten(int rij, int kolom) {
        rij--;
        kolom--;
        if(rij <= GROOTTE && kolom <= GROOTTE) {
            matrix[rij][kolom] = 1;
            teller++;
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < GROOTTE; i++) {
            for(int j = 0; j < GROOTTE; j++) {
                builder.append(matrix[i][j]).append(" ");
            }
            builder.append("\n");
        }
        builder.append("\n");
        return builder.toString();
    }
}
