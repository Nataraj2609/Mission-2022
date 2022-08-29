package Interview.FullForce.DataStructure.codingEverything.EducativeJava1.DS;

public class StackImplementation {
  public static void main(String[] args) {

    int arr[] = {1, 14, 2, 16, 10, 20};
    int res = findThirdMax(arr);
    System.out.println(res);
  }

  private static int findThirdMax(int[] arr) {

    int firstMax = Integer.MIN_VALUE;
    int secondMax= Integer.MIN_VALUE;
    int thirdMax= Integer.MIN_VALUE;

    for(int i: arr){
      if(i > firstMax){
        thirdMax = secondMax;
        secondMax = firstMax;
        firstMax = i;
      } else if(i > secondMax){
        thirdMax = secondMax;
        secondMax = i;
      }	else if(i > thirdMax)
        thirdMax = i;
    }
    return thirdMax;
  }
}
