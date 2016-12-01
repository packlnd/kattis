import java.util.*;

public class Lecture {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    in.nextLine();
    Map<String, String> map = new HashMap<String, String>();
    for (int i=0; i<m; ++i) {
      String line = in.nextLine();
      String[] s = line.split(" ");
      map.put(s[0], s[1]);
    }

    String[] words = in.nextLine().trim().split(" ");
    StringBuilder tmp = new StringBuilder();
    for (String w1 : words) {
      String w2 = map.get(w1);
      tmp.append((w1.length() <= w2.length() ? w1 : w2) + " ");
    }
    String sen = tmp.toString().trim();
    System.out.println(sen);
  }
}
