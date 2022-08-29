package fileReading.FreshWorks.Educative.FastAndSlowPointer;

public class PalindromeOfLL {
  ListNode head;

  public static void main(String[] args) {
    PalindromeOfLL ll = new PalindromeOfLL();
    ll.head = new ListNode(1);
    ll.head.next = new ListNode(2);
    ll.head.next.next = new ListNode(3);
    ll.head.next.next.next = new ListNode(2);
    ll.head.next.next.next.next = new ListNode(19);

    System.out.println(isPalindrome(ll.head));
  }

  private static boolean isPalindrome(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    ListNode reversedHead = reverseLL(slow);
    while(head != null && reversedHead != null){
      if(head.value != reversedHead.value)
        return false;

      head = head.next;
      reversedHead = reversedHead.next;
    }

    return true;
  }

  private static ListNode reverseLL(ListNode head) {
    ListNode prev = null, next, curr = head;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}

class ListNode {
  int value;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}