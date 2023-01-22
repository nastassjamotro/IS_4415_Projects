public class Main2 {
  public static void main(String args[]) {
    Vehicle[] vehicle = new Vehicle[5];
    
    vehicle[0] = new Train();
    vehicle[1] = new Car();
    vehicle[2] = new Bicycle();
    vehicle[3] = new Train();
    vehicle[4] = new Car();
    
    for (int i = 0; i < 5; i++) {
      vehicle[i].speedUp();
      vehicle[i].slowDown();
    }
  }
}
