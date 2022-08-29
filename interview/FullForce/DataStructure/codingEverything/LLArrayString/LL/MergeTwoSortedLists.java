package Interview.FullForce.DataStructure.codingEverything.LLArrayString.LL;


public class MergeTwoSortedLists {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      this.data = d;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    MergeTwoSortedLists d = new MergeTwoSortedLists();
    d.head = new Node(5);
    d.head.next = new Node(6);
    d.head.next.next = new Node(440);
    d.head.next.next.next = new Node(5456);
    d.head.next.next.next.next = new Node(98765);

    displayLL(d.head);

    MergeTwoSortedLists d2 = new MergeTwoSortedLists();
    d2.head = new Node(2);
    d2.head.next = new Node(5);
    d2.head.next.next = new Node(32);
    d2.head.next.next.next = new Node(2323);
    d2.head.next.next.next.next = new Node(2134124);

    displayLL(d2.head);
    d.head = merge(d.head, d2.head);
    displayLL(d.head);
  }

  private static Node merge(Node list1, Node list2) {
    Node dummy = new Node(Integer.MIN_VALUE);
    Node tail = dummy;

    while (true) {
      if (list1 == null) {
        tail.next = list2;
        break;
      }
      if(list2 == null){
        tail.next = list1;
        break;
      }
      if(list1.data <= list2.data){
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }

    return dummy.next;
  }


  private static void displayLL(Node head) {
    while (head != null) {
      System.out.print(head.data + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }
}