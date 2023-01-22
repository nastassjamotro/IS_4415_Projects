package alpha;

public class Access {
  int intDefault = 10;
  public int intPublic = 10;
  protected int intProtected = 10;
  private int intPrivate = 10;
  
  public int getDefault() {
    return intDefault;
  }

  public void setDefault(int intDefault) {
    this.intDefault = intDefault;
  }

  public int getPrivate() {
    return intPrivate;
  }

  public void setPrivate(int intPrivate) {
    this.intPrivate = intPrivate;
  }
}
