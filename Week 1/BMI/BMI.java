import java.util.Scanner;

public class Main{

     public static void main(String []args){
        Scanner keyboard = new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter your name: ");  
        String name = keyboard.nextLine();              //reads string 
        System.out.print("Enter your length (in meter): ");
        double length = keyboard.nextFloat();
        System.out.print("Enter your weight (in kg): ");
        int weight = keyboard.nextInt();
        double bmi = weight / (length  * length);
        System.out.print("Beste " + name + ", je BMI bedraagt " + String.format("%.1f",bmi));
        if (bmi < 18.5) {
            System.out.print(". Dat is een ondergewicht.");
            return;
        } else if (bmi < 24.9) {
            System.out.print(". Dat is een normaal gewicht.");
            return;
        } else if (bmi < 29.9) {
            System.out.print(". Dat is een overgewicht.");
            return;
        } else if (bmi < 39.9) {
            System.out.print(". Dat is zwaarlijvig.");
            return;
        } else {
            System.out.print(". Dat is obesitas.");
            return;
        }
     }
}
