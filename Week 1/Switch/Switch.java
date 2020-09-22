import java.util.Scanner;

class Switch {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter first number: ");  
    int num1 = keyboard.nextInt();
    System.out.print("Enter second number: ");  
    int num2 = keyboard.nextInt();
    int temp = num1;
    System.out.println("first: " + num1 + " second: " + num2 + " temporary: " + temp);
    num1 = num2;
    System.out.println("first: " + num1 + " second: " + num2 + " temporary: " + temp);
    num2 = temp;
    System.out.println("first: " + num1 + " second: " + num2 + " temporary: " + temp);
  }
}
