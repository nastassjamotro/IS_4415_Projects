import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class FileCopy {
  public static void copyFromFileToFile(String source, String destination) throws Exception {
    BufferedReader input = null;
    try {
      input = new BufferedReader(new FileReader(source));
    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    }
    
    String text = input.readLine();
    PrintWriter pw = new PrintWriter(new File(destination));
    while (text != null) {
      pw.println(text);
      text = input.readLine();
    }
    
    pw.close();
    input.close();
  }
}
