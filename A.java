import java.util.*;
import java.math.*;
okej,

  public static void main(String[] args) {
    System.out.println();
}
public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int T = in.nextInt();
    Node[] nodes = new Node[n];
    for (int i=0; i<n; ++i)
      nodes[i] = new Node(i);
    for (int i=0; i<m; ++i) {
      int u = in.nextInt();
      int v = in.nextInt();
      int t = in.nextInt();
      nodes[u-1].edges.add(new Edge(nodes[u-1], nodes[v-1], t));
    }

    int[][] dp = new int[n][n+1];
    int[] prev = new int[n+1];
  }

  public static class Node {
    boolean visited;
    int num;
    List<Edge> edges = new ArrayList<Edge>();

    public Node(int num) {
      this.num = num;
    }
  }

  public static class Edge {
    Node from;
    Node to;
    long w;

    public Edge(Node from, Node to, long w) {
      this.from = from;
      this.to = to;
      this.w = w;
    }
  }
}
