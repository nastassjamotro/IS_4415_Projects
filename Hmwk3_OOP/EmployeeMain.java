// write a program that can have at least four different employees. each has name and hourly pay
// program shold input the hours worked for employees and then calculate their net pay

import java.util.Scanner;

public class EmployeeMain {
  public static void main(String args[]) {
    // 4 employees min
    // call the employees class to initiate array using information from that class
    Employees[] emp = new Employees[4];
    emp[0] = new Employees("Fred Boyle", 15.50);
    emp[1] = new Employees("Albert Einstein", 21.35);
    emp[2] = new Employees("Lawrence Kraus", 2.12);
    emp[3] = new Employees("Stepehn Hawking", 20.01);
    
    // asking for user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the hours worked for all the employees last week");
    int hours = input.nextInt();
    
    // catching an error
    try {
      for (int i = 0; i < 4; i++) {
          System.out.printf("The employee %s, who earns $.2f per hour, worked for %d last week and took home %.2f after taxes.\n", emp[i].getEmpNme(), emp[i].getRate(), hours, emp[i].getPaid(hours));
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array out of bounds exception caught");
    } // end of try-catch block
  } // end of main
} // end of class
