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
        System.out.print("Dear " + name + ", your BMI is " + String.format("%.1f",bmi));
        if (bmi < 18.5) {
            System.out.print(". You are underweight.");
            return;
        } else if (bmi < 24.9) {
            System.out.print(". This is a normal weight.");
            return;
        } else if (bmi < 29.9) {
            System.out.print(". You are overweight.");
            return;
        } else if (bmi < 39.9) {
            System.out.print(". You are obese.");
            return;
        } else {
            System.out.print(". You have obesity.");
            return;
        }
     }
}
