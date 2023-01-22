// ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(string args[]) {
    Scanner input = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();
    
    String loop;
    
    do {
      System.out.println("Employee name: ");
      String name = input.nextLine();
      
      System.out.println("Hourly rate: ");
      float hourlyRate = input.nextFloat();
      
      System.out.println("Hours worked: ");
      int hoursWorked = input.nextLine();
      input.nextLine();
      
      EmployeeList.addEmployee(employees, new Employee(name, hourlyRate, hoursWorked));
      
      System.out.println("Do you have more employees to enter? Y/N");
      loop = input.nextLine();
    } while(loop.equalsIgnoreCase("y"));
    
    EmployeeList.displayAllPay(employees);
  }
}

// below is Linkedlist version

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    LinkedList<Employee> employees = new LinkedList<>();
    
    String loop;
    
    do {
      System.out.println("Employee name: ");
      String name = input.nextLine();
      
      System.out.println("Hourly rate: ");
      float hourlyRate = input.nextFloat();
      
      System.out.println("Hours worked: ");
      int hoursWorked = input.nextLine();
      input.nextLine();
      
      EmployeeList.addEmployee(employees, new Employee(name, hourlyRate, hoursWorked));
      
      System.out.println("Do you have more employees to enter? Y/N");
      loop = input.nextLine();
    } while (loop.equalsIgnoreCase("y"));
    
    // catch error
    try {
      EmployeeList.displayAllPay(employees);
    } catch (EmptyListException e) {
      System.out.println(e);
    }
  }
}
