public class Main {
  public static void main(String args[]) {
    TextReader tr = new TextReader("reading.txt");
    tr.readFile();
    tr.printLines();
  }
}
