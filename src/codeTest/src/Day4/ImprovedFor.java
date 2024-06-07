package Day4;

import java.util.stream.IntStream;

public class ImprovedFor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
        int sum = 0;
        for (int n : scores){
            sum += n;
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + sum / scores.length);
        System.out.println("총합: " + IntStream.of(scores).sum());
        System.out.println("평균: " + IntStream.of(scores).average());

        String[] names = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
        for (String name : names) {
            if (name.length() >= 5) {
                System.out.println(name);
            }
        }
    }
}
