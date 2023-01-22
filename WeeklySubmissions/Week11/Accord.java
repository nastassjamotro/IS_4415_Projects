package automobiles.sedan;

import automobiles.Automobiles;
import automobiles.parts.Tire;
import automobiles.parts.Engine;

public class Accord extends Automobiles {
  public Accord(String maker) {
    super(maker);
  }

  @Override
  public void changeTire(Tire t, int number) {
    System.out.println("Accord tire change");
  }

  @Override
  public void changeEngine(Engine e) {
    System.out.println("Accord engine change");
  }
}
