import java.util.Scanner;

public class Extremes{

     public static void main(String []args){
        int max = 0;
        int min = 0;
        int num = 0;
        int count = -1;
        Scanner keyboard = new Scanner(System.in);  
        while (num != -1) {
            System.out.print("Enter a number: ");  
            num = keyboard.nextInt();             
            if (num > max ) {
                max = num;
            } else if (num < min ) {
                min = num;
            }
            count++;
        }
        System.out.println("The maximum is: " + max); 
        System.out.println("The minimum is: " + min); 
        System.out.println(count + " numbers where entered."); 
        
     }
}
