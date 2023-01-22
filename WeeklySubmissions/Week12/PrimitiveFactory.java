public class PrimitiveFactory {
  private int i;
  
  public PrimitiveFactory(int ii) {
    i = ii;
  }
  
  public static Integer boxInteger(int ii) {
    return new Integer(ii);
  }
  
  public static Integer unboxInteger(Integer iii) {
    int ii = iii;
    return ii;
  }
  
  public static int convertStringToInt(String s) {
    int ii = 0;
    for (int i = 0; i < s.length(); i++) {
      //idk
    }
    return ii;
  }
}
