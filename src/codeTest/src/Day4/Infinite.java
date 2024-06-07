package Day4;

import java.util.stream.IntStream;

public class Infinite {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 300) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // 1
        int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
        int max = 0, i2 = 0;
        while (i2 < numbers.length) {
            if (max < numbers[i2]) {
                max = numbers[i2];
            }
            i2 += 1;
        }
        System.out.println("max = " + max);
        // 강사님 ver.
        int maxEx = numbers[0];
        int idx = 1;
        while (idx < numbers.length) {
            if (numbers[idx] > maxEx) {
                maxEx = numbers[idx];
            }
            idx++;
        }

        // 3
        int[] numbers2 = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
        int posSum = 0, negSum = 0, i3 = 0;
        while (i3 < numbers2.length) {
            if (numbers2[i3] < 0) {
                negSum += numbers2[i3];
            } else {
                posSum += numbers2[i3];
            }
            i3++;
        }
        System.out.println("양수 합 = " + posSum);
        System.out.println("음수 합 = " + negSum);

        int posNum = IntStream.of(numbers2).filter(num -> num > 0).sum();
        int neNum = IntStream.of(numbers2).filter(num -> num < 0).sum();
        System.out.println("posNum = " + posNum);
        System.out.println("neNum = " + neNum);
    }
}
