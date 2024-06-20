package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuiz {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        /*List<Integer> collect = numbers.stream()
                .filter(integer -> integer % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(collect);

        numbers.stream()
                .filter(integer -> integer % 2 == 1)
                .forEach(integer -> System.out.println(integer));*/

        List<String> strings = new ArrayList<>(Arrays.asList("a", "abc", "abcde", "abcdef", "abcdefg"));
        strings.stream()
                .filter(s -> s.length() <= 5)
                .forEach(s -> System.out.println(s));
    }
}
