import java.util.Scanner;

class Operations {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a number: ");  
    int num1 = keyboard.nextInt();
    System.out.print("Enter another number: ");  
    int num2 = keyboard.nextInt();
    System.out.println("Choose a math operation: ");
    System.out.println("  1 addition: ");   
    System.out.println("  2 subtraction: ");
    System.out.println("  3 multiplication: ");   
    System.out.println("  4 division: ");
    System.out.println("  5 exponentiation: ");
    int operation = keyboard.nextInt();
    System.out.println("Your choice: " + operation);
    if (operation == 1) {
      System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    } else if (operation == 2) {
      System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    } else if (operation == 3) {
      System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    } else if (operation == 4) {
      System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    } else if (operation == 5) {
      int exp = num1;
      for (int i = 1; i < num2; i++) {
        exp = exp * num1;
      }
      System.out.println(num1 + " ^ " + num2 + " = " + exp);
    }
  }
}
