package beta;

import alpha.Access;

public class TestAccess extends Access {
  /*public static void printMessage() {
    TestAccess test = new TestAccess();
    System.out.println("intDefault=" + test.intDefault);
    System.out.println("intPublic=" + test.intPublic);
    System.out.println("intProtected=" + test.intProtected);
    System.out.println("intPrivate=" + test.intPrivate);
    }*/
  
  // this doesn't initially compile because default and private are not visible with the code above
  // added getter and setter methods in Access class to fix it
  // below is new fixed method

  public static void printMessage() {
    TestAccess test = new TestAccess();
    System.out.println("intDefault=" + test.getDefault());
    System.out.println("intPublic=" + test.intPublic);
    System.out.println("intProtected=" + test.intProtected);
    System.out.println("intPrivate=" + test.getPrivate());
  }

  public static void main(String args[]) {
    printMessage();
  }
}
