import java.util.*;

public class Parade {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] p = new int[n][2];
    int totl = 0;
    int totr = 0;
    for (int i=0; i<n; ++i) {
      p[i][0] = in.nextInt();
      p[i][1] = in.nextInt();
      totl += p[i][0];
      totr += p[i][1];
    }
    int b = Math.abs(totl-totr);
    int c = 0;
    for (int i=0; i<n; ++i) {
      int nl = totl-p[i][0]+p[i][1];
      int nr = totr-p[i][1]+p[i][0];
      int newb = Math.abs(nl - nr);
      if (newb > b) {
        b = newb;
        c = i+1;
      }
    }
    System.out.println(c);
  }
}
