package StreamClassLearning;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {

        //Filter Predicate
        List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Nat");
        nameList.add("Benjamin Holeweinko");

        long count = nameList.stream().filter(s -> s.length() >= 4).count();
        System.out.println(count);

    }
}
