/*import java.util.ArrayList;

public class EmployeeList {
  // method adding employees to array list
  public static void addEmployee(ArrayList<Employee> employees, Employee emp) {
    employees.add(emp);
  } // end of addEmployee method
  
  // method looping through all employees and call displayPay method on each
  public static void displayAllPay(ArrayList<Employee> employees) {
    for (Employee emp: employees) {
      emp.displayPay();
      System.out.println();
    } // end of for loop
  } // end of displayAllPay method
} // end of class
*/


// the above is the ArrayList version. Below is the LinkedList version
import java.util.LinkedList;

public class EmployeeList {
  // method adding employees to linked list
  public static void addEmployee(LinkedList<Employee> employees, Employee emp) {
    employees.add(emp);
  } // end of addEmployee method

  // method looping through all employees and call displayPay method
  public static void displayAllPay(LinkedList<Employee> employees) throws EmptyListException {
    if (employees.isEmpty()) {
      throw new EmptyListException();
    } while (!employees.isEmpty()) {
      employees.poll().displayPay();
    } // end of if/while loop
  } // end of displayAllPay method
} // end of class
