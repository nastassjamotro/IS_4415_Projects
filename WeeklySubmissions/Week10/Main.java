public class Main {
  public static void main(String args[]) {
    Animal[] animalList = new Animal[5];
    animalList[0] = new Duck("Duck");
    animalList[1] = new Fish("Fish");
    animalList[2] = new Fish("Fish2");
    animalList[3] = new Dog("Dog");
    animalList[4] = new Duck("Duck2");
    
    for (int i = 0; i < 5; i++) {
      animalList[i].swim();
    }
  }
}
