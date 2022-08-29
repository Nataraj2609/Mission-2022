package Interview.FullForce.DataStructure.codingEverything.EducativeJava1;

public class Demo {
  static Node head;

  public static void main(String[] args) {
    head = new Node(12);
    head.next = new Node(34);
    head.next.next = new Node(56);
    head.next.next.next = new Node(78);
    head.next.next.next.next = new Node(90);
    head.next.next.next.next.next = new Node(333);
    head.next.next.next.next.next.next = new Node(9898989);
    displayLL(head);
    head = reverseLL(head, 3);
    displayLL(head);
  }

  private static Node reverseLL(Node head, int k) {

    if (head == null || head.next == null || k == 1) {
      return head;
    }

    Node dummy = new Node(-1);
    dummy.next = head;

    Node prev = dummy;
    Node curr = dummy;
    Node next = dummy;

    // Calculating the length of linked list
    int count = 0;
    while (curr != null) {
      count++;
      curr = curr.next;
    }
    System.out.println("Count(including dummy) is " + count);

    // Iterating till next is not NULL
    while (next != null) {
      curr = prev.next; // Curr position after every reverse group
      next = curr.next; // Next will always next to curr
      int toLoop = count > k ? k : count - 1; // toLoop will set to count - 1 in case of remaining element
      System.out.println("toLoop is " +toLoop);

      for (int i = 1; i < toLoop; i++) {
        // 4 steps as discussed above
        curr.next = next.next;
        next.next = prev.next;
        prev.next = next;
        next = curr.next;
      }
      prev = curr; // Setting prev to curr
      count -= k; // Update count
    }
    return dummy.next;
  }

  private static void displayLL(Node head) {
    while (head != null) {
      System.out.print(head.data + "-> ");
      head = head.next;
    }
    System.out.println("NULL");
  }

  static class Node {
    int data;
    Node next;

    public Node(int d) {
      this.data = d;
    }
  }
}