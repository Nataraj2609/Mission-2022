package Interview.FullForce.DataStructure.codingEverything;

public class ReverseALL {
  Node head;

  public static void main(String[] args) {
    ReverseALL obj = new ReverseALL();
    obj.head = new Node(22);
    obj.head.next = new Node(4);
    obj.head.next.next = new Node(88);
    printLL(obj.head);
    obj.head = reverseLL(obj.head);
    printLL(obj.head);
  }

  private static Node reverseLL(Node head) {
    Node prev = null;
    Node next;

    Node curr = head;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  private static void printLL(Node head) {
    while (head != null) {
      System.out.print(head.data + " -> ");
      head = head.next;
    }
    System.out.println("NULL");
  }
}

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
  }
}