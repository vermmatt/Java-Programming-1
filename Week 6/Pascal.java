import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        int MAX = 12;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het aantal rijen: ");
        int aantal = keyboard.nextInt();
        if(aantal > 12 || aantal < 1) {
            aantal = MAX;
        }
        int[][] matrix = new int[aantal][aantal];
        for(int i = 0; i < aantal; i++) {
            matrix[i][0] = 1;
        }

        for(int i = 1; i < aantal; i++) {
            for(int j = 1; j < aantal; j++) {
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
            }
        }

        for(int i = 0; i < aantal; i++) {
            for(int j = 0; j < aantal; j++) {
                if(matrix[i][j] != 0) {
                    System.out.printf("%4d", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }


}
