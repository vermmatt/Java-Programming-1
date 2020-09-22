import java.util.Scanner;

class Series {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How many numbers do you want to print? ");  
    int times = keyboard.nextInt();
    System.out.print("What is the start number? ");  
    int start = keyboard.nextInt();
    System.out.print("What is the step size? ");  
    int step = keyboard.nextInt();
    System.out.println(start);  
    while (times > 1) {
      start = start + step;
      System.out.println(start);
      times--;
    }

  }
}
