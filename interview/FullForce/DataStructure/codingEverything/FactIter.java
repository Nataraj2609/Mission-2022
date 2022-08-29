package Interview.FullForce.DataStructure.codingEverything;

public class FactIter {
  public static void main(String[] args) {
    //factIter(4) = 1*2*3*4
    System.out.println(factIter(4));
  }

  private static int factIter(int n) {
    int fact = 1;
    for(int i =1; i<=n; i++){
      fact*=i;
    }
    return fact;
  }
}
