public class Watermelon {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int w = in.nextInt();
    String ans = w > 2 && w % 2 == 0 ? "YES" : "NO";
    System.out.println(ans);
  }
}
