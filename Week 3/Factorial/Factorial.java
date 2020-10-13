public class Factorial {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 20) {
            long fact = 1;
            for (int j = i; j>0; j--) {
                fact *= j;
            }
            System.out.printf("%2s! %3s %s\n", i, "-->", fact);
            i++;
        }
    }
}
