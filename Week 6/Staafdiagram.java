public class Staafdiagram {
    public static void main(String[] args) {
        int[] getallen = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 8, 14
        };
        int min = getallen[0];
        int max = getallen[0];
        for(int i = 0; i < getallen.length; i++) {
            if(getallen[i] < min) {
                min = getallen[i];
            } else if(getallen[i] > max) {
                max = getallen[i];
            }
        }
        int teller = 0;
        int aantalStaven = max - min + 1;
        int[] staven = new int[aantalStaven];
        for(int i = 0; i < aantalStaven; i++) {
            for(int j = 0; j < getallen.length; j++) {
                if(min+i == getallen[j]) {
                    teller++;
                }
            }
            staven[i] = teller;
            String stars = "*".repeat(staven[i]);
            System.out.printf("%2d: %s%n", (min+i), stars);
            teller = 0;
        }
    }
}
