import java.util.Scanner;

public class Triangle{

     public static void main(String []args){
        Scanner keyboard = new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter the height: ");  
        int num = keyboard.nextInt();              //reads string 
        int row = 1;
        int column = 1;
        
        while (row <= num) {
            while (column < row) {
                System.out.print("42 ");
                column++;
                
            }
            System.out.println("42 ");
            column = 1;
            row++;
        }
     }
}
