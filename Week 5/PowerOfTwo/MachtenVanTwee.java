public class MachtenVanTwee {
    private static int MAX = 21;
    private int[] machten;

    public static int getMax() {
        return MAX;
    }

    public void maakTabel(int aantal) {
        machten = new int[aantal];
    }

    public void vulTabel() {
        for(int i = 0; i < machten.length; i++) {
            machten[i] = (int) Math.pow(i,2);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Machten van 2\n");
        for(int i = 0; i < machten.length; i++) {
            result.append(String.format("2 tot de macht %2d = %d%n", i, machten[i]));
        }
        return result.toString();
    }
}
