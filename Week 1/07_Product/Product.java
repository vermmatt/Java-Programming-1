import java.util.Scanner;

class Product {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter first number: ");  
    int num1 = keyboard.nextInt();
    System.out.print("Enter second number: ");  
    int num2 = keyboard.nextInt();
    System.out.print("Enter third number: ");  
    int num3 = keyboard.nextInt();
    System.out.println("The product is: " + num1*num2*num3);  

  }
}
