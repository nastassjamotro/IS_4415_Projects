public class Table {
  private String personA;
  private String personB;
  
  public void addPersonAToTable(String p1) {
    personA = p1;
  }
  
  public void addPersonBToTable(String p2) {
    personB = p2;
  }
  
  public void displayWhoSitsAtTheTable() {
    System.out.print(personA.getNameOfPerson() + " is sitting with " );
    System.out.print(personB.getNameOfPerson());
  }
}
