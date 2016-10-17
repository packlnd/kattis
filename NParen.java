public class NParen {
  public static void main(String[] args) {
    int N = 15;
    recurse("", N, N);
    System.out.println();
  }

  static void recurse(String s, int l, int r) {
    if (l == 0 && r == 0) {
      System.out.print(s + " ");
      return;
    }
    if (l > 0) recurse(s + "(", l-1, r);
    if (l != r && r > 0) recurse(s + ")", l, r-1);
  }
}
