import java.util.Scanner;
import java.lang.Math; 

class Population {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int count = 1;
    System.out.print("Enter the current population size: ");  
    double size = keyboard.nextInt();
    System.out.print("Enter the number of years: ");  
    int years = keyboard.nextInt();
    System.out.print("Enter the growth percentage: ");  
    double growth = 1+(keyboard.nextDouble()/100);
    System.out.println("Current population size: " + Math.round(size));  
    while (count <= years) {
      size = size * growth;
      System.out.println("The population after " + count + " years is " +Math.round(size));
      count++;
    }
  }
}
