package Day1;

public class Types {

    public static void main(String[] args) {
        int a1 = 20, b1 = 30, d1 = 50;
        System.out.println(a1 + b1 + d1);

        // 정수형 자료형
        int a = 1;
        byte b = 2;
        long c = 3;
        short d = 4;

        // 실수형 자료형
        float e = 0.1f;
        double f = 0.2;

        // 문자 자료형
        char g = 'a'; // 문자

        // boolean
        boolean isTrue = true;
        boolean isFalse = false;
        if (isTrue) {
            System.out.println("이건 트루입니다.");
        } else {
            System.out.println("이건 펄스입니다.");
        }

        // 문자열 자료형
        String str = "Hello World";

        // 정수 자료형 범위
//        int h = 2343243244;
//        short i = 234234234234;
//        byte j = 234123214124;

        int k = 1;
        int l = a;
        System.out.println(a);
        System.out.println(b);

        byte m = 127;
        b++;
        System.out.println(b);

        // 정수형도 되는 char
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
    }
}
