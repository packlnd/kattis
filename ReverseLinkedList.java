public class ReverseLinkedList {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }
  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    n5.next = n6;
    n4.next = n5;
    n3.next = n4;
    n2.next = n3;
    n1.next = n2;
    printLinkedList(n1);
    n1 = reverse(n1);
    printLinkedList(n1);
  }

  public static void printLinkedList(Node n) {
    while (n != null) {
      System.out.print(n.data + "->");
      n = n.next;
    }
    System.out.println();
  }

  public static Node reverse(Node n) {
    return reverse(n, null);
  }

  public static Node reverse(Node n, Node previous) {
    if (n.next == null) {
      n.next = previous;
      return n;
    } else {
      Node ret = reverse(n.next, n);
      n.next = previous;
      return ret;
    }
  }
}
