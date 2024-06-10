package Day4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class For {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            System.out.println("현재 i의 값은 = " + i);
        }

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        int sum2 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum();
        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);

        int n = 20, summ = 0;
        for (int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                summ += i;
            }
        }
        System.out.println("sum = " + summ);

        int a = 1, b = 1, c = 0;
        for(int i = 3; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println(arr[9]);

        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

        for (int l = 0; l > -101; l--) {
            if (l % 2 == 0) {
                System.out.println(l);
            }
        }

        IntStream.rangeClosed(0, -100).filter(l -> l % 2 == 0).forEach(o -> System.out.println(o + " "));

        int[] fibo = new int[100];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int k = 2; k < fibo.length; k++) {
            fibo[k] = fibo[k - 2] + fibo[k - 1];
        }
        for (int m : fibo){
            System.out.println(m);
        }
        Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
    }
}
