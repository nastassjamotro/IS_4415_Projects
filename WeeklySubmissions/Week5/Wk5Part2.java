import java.util.Scanner;

public class Wk5Part2.java {
  public static void main(String args[]) {
    System.out.println("Enter a number between 1 and 2000");
    Scanner input = new Scanner(System.in);
    short magicNumber = input.nextShort();
    
    switch(magicNumber) {
      case 1001:
        System.out.print(magicNumber + "is a magic number");
      break;
      case 1234:
        System.out.print(magicNumber + "is a magic number");
      break;
      case 898:
        System.out.print(magicNumber + "is a magic number");
      break;
      default:
        System.out.print(magicNumber + " is not a magic number");
    }
  }
}
