public class StringsVergelijken3 {
    public static void main(String[] args) {
        String stringEen = "java";
        String stringTwee = "Java";
        String stringDrie = "JAVA";
        if (stringEen.compareToIgnoreCase(stringTwee) == 0) {
            System.out.printf("%s en %s zijn gelijk", stringEen, stringTwee);
        }
        if (stringEen.compareToIgnoreCase(stringDrie) == 0) {
            System.out.printf("\n%s en %s zijn gelijk", stringEen, stringDrie);
        }
        if (stringTwee.compareToIgnoreCase(stringDrie) == 0) {
            System.out.printf("\n%s en %s zijn gelijk", stringTwee, stringDrie);
        }
    }
}
