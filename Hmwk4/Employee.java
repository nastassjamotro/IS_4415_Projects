public class Employee {
  protected String empID;
  protected int salary;
  
  public Employee (string id, int sal) {
    empID = id;
    salary = sal;
  }
  
  public String getID() {
    return empID;
  }
  
  public int getSalary() {
    return salary;
  }
  
  public int calculatePaycheck() {
    return 0;
  }
  
  public String printOut() {
    return empID + " earn $" + calculatePaycheck() + " per paid period";
  }
}
