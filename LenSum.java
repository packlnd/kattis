import java.util.*;

public class LenSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    int s = in.nextInt();
    int[] lower = new int[l];
    int[] highe = new int[l];
    int ls = s;
    for (int i=0; i<l; ++i) {
      lower[i] = getMaxPossibleL(i, l, ls);
      ls -= lower[i];
    }
    int hs = s;
    for (int i=l-1; i>=0; --i) {
      highe[i] = getMaxPossibleH(i, l, hs);
      hs -= highe[i];
    }
    printNumber(lower, s);
    System.out.print(" ");
    printNumber(highe, s);
    System.out.println();
  }

  static int getMaxPossibleH(int i, int l, int s) {
    if (s > 9) return 9;
    return s;
  }

  static int getMaxPossibleL(int i, int l, int s) {
    if (s > 9) return 9;
    return i+1 == l ? s : s-1;
  }

  static void printNumber(int[] V, int s) {
    StringBuilder sb = new StringBuilder();
    int sum = 0;
    boolean number = V.length==1 || V[V.length-1] != 0;
    for (int e : V) {
      number = number && e >= 0;
      sb.insert(0, e);
      sum += e;
    }
    System.out.print((sum == s && number) ? sb : "-1");
  }
}
