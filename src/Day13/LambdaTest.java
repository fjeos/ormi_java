package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        // 함수를 호출
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        /*callList(numbers);*/

        // 반복자로 출력
        /*Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }*/

        // 람다식
        numbers.removeIf((integer) -> integer % 2 == 0);

        System.out.println(numbers);

    }

    /*public static void callList(List<Integer> integerList) {
        for (int i : integerList) {
            System.out.println(i);
        }
    }*/
}
