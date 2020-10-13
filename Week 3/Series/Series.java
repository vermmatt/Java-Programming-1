public class Series {
    public static void main(String[] args) {
        int x = 0;
        //Series1
        while (x < 1000) {
            x = ((2*x) + 1);
            System.out.print(x + " ");
        }
        //Series2
        System.out.print("\n");
        for (int x1 = 1; x1 <= 10; x1++) {
            int result = (int)Math.pow(x1, 3) - (int)Math.pow(x1, 2) + 1;
            System.out.print(result + " ");
        }
        //Series3
        System.out.print("\n");
        for (int x2 = 10; x2 >= 1; x2--) {
            int result = (int)Math.pow(x2, 2) - x2 - 1;
            System.out.print(result + " ");
        }
        //Series4
        System.out.print("\n");
        for (int i = 1; i <= 100; i++) {
            if (i%11 == 0) {
                System.out.print(i + " ");
            }
        }
        //Series5
        System.out.print("\n");
        for (int i = 1; i < 100; i++) {
            if (i%5 == 0 && i%3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
