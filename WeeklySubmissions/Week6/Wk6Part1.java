public class Wk6Part1 {
  public static void main(String args[]) {
    try {
      int[] myNumbers = {7,8,9,10,11};
      for (int i = 0; i < 10; i++) {
        System.out.println("Number is " + myNumbers[i]);
      }
    } catch (Exception e) {
      System.out.println("caught it");
    } finally {
      System.out.println("this code always runs on an exception");
    }
  }
}
