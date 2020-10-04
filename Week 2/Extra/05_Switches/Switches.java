import java.util.Scanner;

public class Switches {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de toestand van schakelaar 1 (true of false): ");
        boolean switch1 = keyboard.nextBoolean();
        System.out.print("Geef de toestand van schakelaar 1 (true of false): ");
        boolean switch2 = keyboard.nextBoolean();
        System.out.print("Geef de toestand van schakelaar 1 (true of false): ");
        boolean switch3 = keyboard.nextBoolean();
        int count = 0;
        if(switch1){
            count++;
        }
        if(switch2){
            count++;
        }
        if(switch3){
            count++;
        }
        if(count>=2){
            System.out.println("Er zijn minstens twee schakelaars aan.");
        }
        if(count==2){
            System.out.println("Er zijn exact twee schakelaars aan.");
        }
        if(count<=1){
            System.out.println("Er staat maximaal 1 schakelaar aan.");
        }
    }
}
