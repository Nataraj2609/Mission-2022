package Interview.FullForce.DataStructure.codingEverything;

public class NthElemInLL {
  public static void main(String[] args) {
    ReverseALL obj = new ReverseALL();
    obj.head = new Node(22);
    obj.head.next = new Node(4);
    obj.head.next.next = new Node(88);
    findNthElem(obj.head, 2);
  }

  private static void findNthElem(Node head, int i) {
    int count = 1;
    while (head!= null){
      System.out.println("Loop "+count);
      if(count == i){
        System.out.println(head.data);
        break;
      }
      head = head.next;
      count++;
    }
  }
}

