import java.util.Arrays;

public class Wk6Part2 {
  public static void main(String args[]) {
    int array1[] = new int[50];
    int array2[] = new int[50];
    for (int x = 1; x <= 50; x++) {
      array[x-1] = x;
    }
    
    int count = 50;
    for (int y = 0; y < 50; y++) {
      array2[y] = count;
      count --;
    }
    
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
    
    int[] array3 = new int[50];
    
    for (int i = 0; i < 50; i++) {
      array3[i] = array1[i]*array2[i];
    }
    System.out.println(Arrays.toString(array3));
  }
}
