import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
  public static void main(String args[]) {
    ArrayList<Integer> array = new ArrayList<Integer>();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    
    int list;
    for (int i = 0; i < 2000; i++) {
      list = (int)(Math.random() * 2001);
      array.add(list);
    }
    //Sytem.out.print(array.size());
    
    for (int i = 0; i < 2000; i++) {
      linkedList.add(array.get(i));
    }
    
    //print
    for (int i = 0; i < 2000; i++) {
      System.out.println(linkedList.get(i));
    }
  }
}
