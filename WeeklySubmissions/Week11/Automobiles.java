package automobiles;

import automobiles.parts.Tire;
import automobiles.parts.Engine;
import automobiles.parts.Chassis;
import automobiles.parts.Bumper;

public abstract class Automobiles {
  private String maker;
  private Tire[] tires = new Tire[4];
  private Engine engine = new Engine();
  private Chassis chassis = new Chassis();
  private Bumper[] bumper = new Bumper[2];

  public Automobiles (String maker) {
    this.maker = maker;
  }

  public abstract void changeTire(Tire t, int number);
  public abstract void changeEngine(Engine e);
}
