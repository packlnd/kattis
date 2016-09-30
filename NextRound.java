import java.util.Scanner;

public class NextRound {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int advance=0;
    int[] V = new int[n];
    for (int i=0; i<n; ++i)
      V[i] = in.nextInt();
    int kth = V[k-1];
    for (int i=0; i<n; ++i) {
      if (V[i] >= kth && V[i] > 0) ++advance;
    }
    System.out.println(advance);
  }
}
