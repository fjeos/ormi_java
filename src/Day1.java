import java.util.Arrays;
import java.util.List;

public class Day1 implements TestInterface {

    public static void main(String[] args) {
        int a = 20, b = 30, c = 50;
        System.out.println(a + b + c);

        // 정수형 자료형
        int a = 1;
        byte b = 2;
        long c = 3;
        short d = 4;

        // 실수형 자료형
        float e = 0.1f;
        double f = 0.2;

        // 문자형 자료형
        char a = 'a'; // 문자

        // boolean
        boolean isTrue = true;
        boolean isFalse = false;

        // 문자열 자료형
        String str = "Hello World";

        int b = 2343243244;
        short c = 234234234234;
        byte d = 234123214124;

        int a = 1;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        byte b = 127;
        b++;
        System.out.println(b);

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        int uniCode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);

        short sVal = 10;
        short result = (short) (sVal + 10);
        System.out.println(result);
        float myFloat = 9.75f;

        float anotherFloat = myFloat * 2;

        System.out.println("Original Float Value: " + myFloat);
        System.out.println("Calculated Float Value: " + anotherFloat);

        boolean isTrue = false;
        if (!isTrue) {
            System.out.println("이건 트루입니다.");
        } else {
            System.out.println("이건 펄스입니다.");
        }
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        List<Integer> list = Arrays.asList(1);
        System.out.println(list.get(0));


    }

    @Override
    public void test() {

    }
}
