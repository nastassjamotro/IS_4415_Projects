import automobiles.parts.Tire;
import automobiles.parts.Engine;
import automobiles.sedan.Accord;
import automobiles.sedan.Elantra;
import automobiles.suv.Explorer;
import automobiles.suv.Navigator;

public class Main1 {
  public static void main(String args[]) {
    Accord accord = new Accord("");
    Elantra elantra = new Elantra("");
    Explorer explorer = new Explorer("");
    Navigator navigator = new Navigator("");

    Tire tire = new Tire();
    Engine engine = new Engine();

    accord.changeTire(tire, 1);
    accord.changeEngine(engine);
    explorer.changeEngine(engine);
    explorer.changeTire(tire, 2);
  }
}
