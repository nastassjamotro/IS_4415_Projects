public class Employee {
  private String name;
  private float hourlyRate;
  private int hoursWorked;
  
  public Employee (String name2, float hourlyRate2, int hoursWorked2) {
    name = name2;
    hourlyRate = hourlyRate2;
    hoursWorked = hoursWorked2;
  }
  
  public void displayPay() {
    System.out.println("Employee name: " + name);
    System.out.println("Hourly Rate: $" + hourlyRate);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Total Pay: " + (hoursWorked*hourlyRate));
  }
}
