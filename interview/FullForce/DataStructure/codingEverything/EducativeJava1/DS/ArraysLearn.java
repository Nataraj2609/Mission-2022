package Interview.FullForce.DataStructure.codingEverything.EducativeJava1.DS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysLearn {
  public static void main(String[] args) {

    //	Given an integer Stream, Find average of k last seen numbers in a stream in java.
    ArrayList<Integer> empIdList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    int k = 5;
    long len = empIdList.size();
    //Expected = 40 / 5 = 8 - average of last k elements
    int res = empIdList.stream().skip(len - k).reduce(0, Integer::sum) / k;
    System.out.println(res);
  }
}
