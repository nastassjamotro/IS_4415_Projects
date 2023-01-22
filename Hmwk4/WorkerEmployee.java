public class WorkerEmployee extends Employee {
  int monthlyPay;
  
  public WorkerEmployee(String empID, int salary) {
    super(empID, salary);
  }
  
  // worker gets charged $100 each paycheck for direct deposit payment
  // 100 * 12 = 1200 deducted for the year
  public int calculatePaycheck() {
    int paid = ((salary - 1200)/12);
    return paid;
  }
}
