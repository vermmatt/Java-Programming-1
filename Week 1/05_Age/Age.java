import java.util.Scanner;

public class Age{

     public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);  
        System.out.println("What is your name? ");  
        String name = keyboard.nextLine(); 
        System.out.println("In which year were you born? ");  
        int year = keyboard.nextInt();
        int age = 2020 - year;
        System.out.println(name + ", you are becoming " + age + " this year."); 
     }
}
