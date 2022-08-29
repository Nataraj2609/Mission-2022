package StreamClassLearning;

import java.util.Objects;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {

        //Concatenating two Streams
        Stream<String> onShoreTeam = Stream.of("Ben", "Tyler", "Johnny", "Nick", null);
        Stream<String> offShoreTeam = Stream.of("Nat", "Kowshik", "Kalai", "Param");

        Stream<String> nx2 = Stream.concat(onShoreTeam, offShoreTeam);

        System.out.println(nx2);

        nx2.filter(Objects::nonNull)
                .forEach(s -> System.out.println(s));

        int[] arr = new int[]{1,2,3};
        System.out.println(arr[1]);
    }
}
