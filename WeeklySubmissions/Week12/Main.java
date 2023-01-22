public class Main {
  public static void main(String args[]) {
    Integer boxed = PrimitiveFactory.boxInteger(5);
    int unboxed = PrimitiveFactory.unboxInteger(boxed);
    int result = PrimitiveFactory.convertStringtoInt("99");
    System.out.println("unboxed is " + unboxed + " result is " + results);
  }
}
