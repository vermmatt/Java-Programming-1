public class Frequencies {
    public static void main(String args[]) {
        int[] getallen = {
                8, 4, 0, 7, 3, 4, 4, 7, 7, 1,
                9, 1, 9, 6, 3, 1, 5, 5, 0, 2,
                5, 3, 4, 1, 2, 1, 3, 1, 4, 0,
                8, 8, 2, 6, 4, 8, 8, 0, 3, 3,
                5, 1, 4, 2, 5, 9, 3, 6, 2, 0
        };
        int[] frequenties = new int[10];
        //berekening frequenties
        for(int i = 0; i < 10; i++) {
            int count = 0;
            for(int j = 0; j < getallen.length; j++) {
                if(i ==  getallen[j]) {
                    count++;
                }
            }
            frequenties[i] = count;
        }

        //output
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d --> %d%n", i, frequenties[i]);
        }
    }
}
