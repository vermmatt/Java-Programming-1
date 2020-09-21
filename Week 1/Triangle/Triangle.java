import java.util.Scanner;

public class Triangle{

     public static void main(String []args){
        Scanner keyboard = new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Geef de hoogte in: ");  
        int num = keyboard.nextInt();              //reads string 
        int rij = 1;
        int kolom = 1;
        
        while (rij <= num) {
            while (kolom < rij) {
                System.out.print("42 ");
                kolom++;
                
            }
            System.out.println("42 ");
            kolom = 1;
            rij++;
        }
     }
}
