public class Vehicle implements ChangeSpeed {
  @Override
  public void speedUp() {
    System.out.println("speed up");
  }
  
  @Override
  public void slowDown() {
    System.out.println("slow down");
  }
}
