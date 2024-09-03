import java.util.*;
public class removeduplicate {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int size;
    System.out.println("enter size of array:");
    size = s.nextInt();
    int[] num = new int[size];
    System.out.println("enter elements:");
    for (int i = 0; i < size; i++) {
      num[i] = s.nextInt();
    }
    int uniqueCount = 0; 
    for (int i = 0; i < size; i++) {
      int current = num[i];
     int foundDuplicate = 0;
      for (int j = i + 1; j < size; j++) {
        if (current == num[j]) {
          foundDuplicate = 1;
          break;
        }
      }
      if (foundDuplicate==0) {
        num[uniqueCount] = current; 
        uniqueCount++;
      }
    }
    System.out.println("Unique elements:");
    for (int i = 0; i < uniqueCount; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
