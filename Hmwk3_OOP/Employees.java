public class Employees {
  private String empName;
  private double rate;
  
  // constructor
  public Employees(String name, double hRate) {
    empName = name;
    rate = hRate;
  }
  
  //getting employee name method
  public String getEmpName() {
    return empName;
  }
  
  //setting employee name
  public void setEmpName(String name) {
    empName = name;
  }
  
  //getting employee rate method
  public double getRate() {
    return rate;
  }
  
  //setting employee rate
  public void setRate(double hRate) {
    rate = hRate;
  }
  
  // calculate tax and final pay
  public double getPaid(double taxes) {
    double paid = (rate * taxes) * 0.70;
    return paid;
  }
}
