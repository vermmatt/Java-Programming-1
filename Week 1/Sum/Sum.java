import java.util.Scanner;

class Sum {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int num = 1;
    int sum = 0;
    int count = 0;
    while (num != 0) {
      System.out.print("Enter a number: ");  
      num = keyboard.nextInt();
      sum = sum + num;
      count++;
    }
    System.out.println("The sum is " + sum);
    System.out.println((count-1) + " numbers were entered.");
    System.out.println("End of program.");
  }
}
