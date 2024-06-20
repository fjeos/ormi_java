package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 10, 9, 5));
        int[] array = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        numbers.stream().filter(integer -> integer % 2 == 0);
        numbers.stream().map(integer -> integer * 2);
        numbers.stream().sorted();


       numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.println(integer));

        List<Integer> collect = numbers.stream()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
        for (int i : collect) {
            System.out.println(i);
        }
        numbers.stream().sorted().
                forEach(integer -> System.out.println(integer));


    }
}
