import java.util.*;
import java.math.*;

public class Registration {
  public static void main(String[] args) {
    HashMap<String, Integer> nameCount = new HashMap<String, Integer>();
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine().trim());
    for (int i=0; i<n; ++i) {
      String name = in.nextLine();
      if (!nameCount.containsKey(name)) {
        System.out.println("OK");
        nameCount.put(name, 0);
        continue;
      }
      int count = nameCount.get(name)+1;
      System.out.println(name + count);
      nameCount.put(name, count);
    }
  }
}
