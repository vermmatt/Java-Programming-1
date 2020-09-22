import java.util.Scanner;

class Switch {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter first number: ");  
    int num1 = keyboard.nextInt();
    System.out.print("Enter second number: ");  
    int num2 = keyboard.nextInt();
    int temp1 = num1;
    int temp2 = num2;
    num2 = temp1;
    num1 = temp2;
    System.out.println("The first number is: " + num1);  
    System.out.println("The second number is: " + num2);  

  }
}
