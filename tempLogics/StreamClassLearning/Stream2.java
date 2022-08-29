package StreamClassLearning;

import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {

        //Limit
        Stream.iterate(1, count -> count + 1)
                .filter(i -> i % 3 == 0)
                .limit(6)
                .forEach(j -> System.out.println(j));
    }
}
