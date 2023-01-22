package automobiles.sedan;

import automobiles.Automobiles;
import automobiles.parts.Tire;
import automobiles.parts.Engine;

public class Elantra extends Automobiles {
  public Elantra(String maker) {
    super(maker);
  }

  @Override
  public void changeTire(Tire t, int number) {
    System.out.println("Elantra tire change");
  }

  @Override
  public void changeEngine(Engine e) {
    System.out.println("Elantra engine change");
  }
}
