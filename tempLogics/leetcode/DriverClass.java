package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DriverClass {
    public static void main(String[] args) {
        DriverClass d = new DriverClass();
        int[] numa = {9,7,8,6,5,3};
        System.out.println(d.containsDuplicate(numa));

    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for(int i: nums){
            if(!hset.add(i))
                return true;
        }
        return false;
    }
}
