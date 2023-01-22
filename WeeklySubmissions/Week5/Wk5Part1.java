import java.util.Scanner;

public class Wk5Part1 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    byte rNumber;
    
    System.out.print("Enter a number from 1-10");
    rNumber = input.nextByte();
    
    if (rNumber >= 1 && rNumber <= 3) {
      System.out.println("that number is in the range from 1 to 3");
    } else if (rNumber >= 4 && rNumber <= 7) {
      System.out.println("that number is in the range from 4 tto 7");
    } else if (rNumber >= 8 && rNumber <= 10) {
      System.out.println("that number is in the range from 8 to 10");
    } else {
      System.out.print(rNumber + " is a number that is less than 1 or greater than 10");
    }
  }
}
