public class Part3 {
  public static void main(String args[]) {
    //placing short into int
    short shortie = 400;
    int biggerShortie = shortie;
    System.out.println(biggerShortie);

    // placing int into short
    int thing = 20;
    short thingTwo = (short)thing;
    System.out.println(thingTwo);

    // placing 1000000 int into a short
    int bigNumber = 1000000;
    short bigNumberTwo = (short)bigNumber;
    System.out.println(bigNumberTwo);

    // placing float 21.123456 into int
    float floaties = 21.123456f;
    int floatiesTwo = (int)floaties;
    System.out.println(floatiesTwo);
    int a = 21;
    int b = 83;
    System.out.println("My first integer is " +a + " and my second integer is " + b);
  }
}
