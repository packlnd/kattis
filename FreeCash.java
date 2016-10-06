import java.util.Scanner;
import java.util.HashMap;

public class FreeCash {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = Integer.parseInt(in.nextLine());
    int max = 0;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (int i=0; i<N; ++i) {
      String s = in.nextLine();
      int val = 0;
      if (map.containsKey(s)) val = map.get(s);
      ++val;
      max = Math.max(max, val);
      map.put(s, val);
    }
    System.out.println(max);
  }
}
