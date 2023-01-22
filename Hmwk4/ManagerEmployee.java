public class ManagerEmployee extends Employee {
  // employees get a monthly pay and earn a salary
  int monthlyPay;
  
  public ManagerEmployee(string empID, int salary) {
    super(empID, salary);
  }
  
  // manager does not get charged anything like a worker
  // gets 20% performance bonus added to each paycheck
  public int calculatePaycheck() {
    int paid = (salary/12);
    paid = (int) ((paid * .2) + paid);
    return paid;
  }
}
