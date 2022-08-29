package fileReading.FreshWorks.Educative.FastAndSlowPointer;

public class LLCycle {
  Node head;

  public static void main(String[] args) {
    LLCycle ll = new LLCycle();
    ll.head = new Node(3);
    ll.head.next = new Node(4);
    ll.head.next.next = new Node(5);
    ll.head.next.next.next = new Node(6);
    ll.head.next.next.next = ll.head.next;

    System.out.println(ll.isCycleFound(ll.head));

  }

  private boolean isCycleFound(Node head) {
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }
}

class Node {
  int data;
  Node next;

  Node(int d) {
    this.data = d;
  }
}
