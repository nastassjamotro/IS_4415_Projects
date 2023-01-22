import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class Main {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<Employee>();
    
    // loop until all 4 employees entered
    for (int i = 0; i < 4; i++) {
      //getting system inputs
      System.out.println("Enter employee ID of an employee");
      String employeeID = input.nextLine();
      
      System.out.println("Enter salary of the employee");
      int salary = input.nextInt();
      
      System.out.println("Is this employee a manager or worker? (Enter 1 for worker and 2 for manager)");
      int workerType = input.nextLine();
      
      //checking system showing that 1 is worker and 2 is manager
      if (workerType == 1) {
        employees.add(new WorkerEmployee(employeeID, salary));
      } else {
          employees.add(new ManagerEmployee(employeeID, salary));
      }
      
      input.nextLine();
    } // end of inputs for loop
    
    // creating a filewriter to export the txt file
    FileWriter output = new FileWriter(new File("employees.txt"));
    String text = " ";
    
    // loop through array listed and write out data that is in each Employee object in the array to a file
    for (Employee emp : employees) {
      text = text + emp.printOut() + "\n";
    }
    
    output.write(text);
    output.close();
  }
}







