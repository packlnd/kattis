import java.util.*;

public class Chewbacca {
  private static char flip(char c, boolean first) {
    long n = Long.parseLong("" + c);
    if (first && n == 9)
      return c;
    if (n<5)
      return c;
    return Long.toString(9-n).charAt(0);


  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] ar = in.nextLine().toCharArray();
    for (int i=0; i<ar.length; ++i) {
      ar[i] = flip(ar[i], i==0);
    }
    long n = Long.parseLong(new String(ar));
    if (n == 0)
      System.out.println("9");
    else
      System.out.println(n);
  }
}
