import java.util.Scanner;

public class Wk4Part2 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age:");
    int age = input.nextInt();
    System.out.print("Enter your name:");
    input.nextLine();
    String name = input.nextLine();
    System.out.print("Hello student: " + name + " you are " + age + " years old");
  }
}
