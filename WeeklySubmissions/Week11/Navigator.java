package automobiles.suv;

import automobiles.Automobiles;
import automobiles.parts.Tire;
import automobiles.parts.Engine;

public class Navigator extends Automobiles {
  public Navigator(String maker) {
    super(maker);
  }

  @Override
  public void changeTire(Tire t, int number) {
    System.out.println("Navigator tire change");
  }

  @Override
  public void changeEngine(Engine e) {
    System.out.println("Navigator engine change");
  }
}
