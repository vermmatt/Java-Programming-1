public class ASCIITable {
    public static void main(String[] args){
        int num = 32;
        while(num < 255){
            for(int j = 1; j <= 6; j++){
                if(num>255){
                    break;
                }
                System.out.printf("%15s", (char)num + " ( " + num + ")");
                num++;
            }
            System.out.println();
        }
    }
}
