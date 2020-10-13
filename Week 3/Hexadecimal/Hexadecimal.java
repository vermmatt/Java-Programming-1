public class Hexadecimal {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            switch(i) {
                default:
                    System.out.print(i + " "); break;
                case(10): System.out.print("A "); break;
                case(11): System.out.print("B "); break;
                case(12): System.out.print("C "); break;
                case(13): System.out.print("D "); break;
                case(14): System.out.print("E "); break;
                case(15): System.out.print("F "); break;
            }
        }
    }
}
