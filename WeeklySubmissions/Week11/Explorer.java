package automobiles.suv;

import automobiles.Automobiles;
import automobiles.parts.Tire;
import automobiles.parts.Engine;

public class Explorer extends Automobiles {
  public Explorer(String maker) {
    super(maker);
  }

  @Override
  public void changeTire(Tire t, int number) {
    System.out.println("Explorer tire change");
  }

  @Override
  public void changeEngine(Engine e) {
    System.out.println("Explorer engine chnge");
  }
}
