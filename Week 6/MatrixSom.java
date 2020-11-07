public class MatrixSom {
    public static void main(String[] args) {
        int[][] eerste = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] tweede = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] som = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                som[i][j] = eerste[i][j] + tweede[i][j];
                System.out.print(som[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int[] arr : som) {
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
