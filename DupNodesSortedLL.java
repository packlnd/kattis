Node RemoveDuplicates(Node head) {
  if (head == null)
    return null;
  for (Node current = head; current != null && current.next != null; current=current.next) {
    while (current != null && current.next != null && current.next.data == current.data) {
      current.next = current.next.next;
    }
  }
  return head;
}
