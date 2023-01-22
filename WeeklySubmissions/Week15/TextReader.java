import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TextReader {
  private String fileName;
  private ArrayList<String> text;
  
  public TextReader (String fileName2) {
    fileName = fileName2;
    text = new ArrayList<>();
  }
  
  public void readFile() {
    File file = new File(fileName);
    try {
      Scanner input = new Scanner(file);
      text = new ArrayList<>();
      while (input.hasNextLine()) {
        text.add(input.nextLine());
      }
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("not found");
    }
  }
  
  public void printLines() {
    for (int i = 0; i < text.size(); i++) {
      System.out.println(text.get(i));
    }
  }
}
