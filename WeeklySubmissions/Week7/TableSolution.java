public class TableSolution {
  public static void main(String args[]) {
    Person p1 = new Person("Dr. Mohr");
    Person p2 = new Person("Chong Oh");
    Table table = new Table();
    table.addPersonAToATable(p1);
    table.addPersonBToTAble(p2);
    table.displayWhoSitstTheTable();
  }
}
