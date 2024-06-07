package Day2;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[100];
        String[] arr2 = new String[1000];

        int positive = 10;
        int negative = -10;

        System.out.println("양의 부호 연산자 적용: " + (+positive));
        System.out.println("음의 부호 연산자 적용: " + (-positive));
        System.out.println("음의 부호 연산로 부호 반전: " + (+negative));
        System.out.println("음의 부호 연산로 다시 부호 반전: " + (-negative));

        int x = 5;
        int y = 5;
        System.out.println("전위 증가 연산자: " + (++x));
        System.out.println("후위 증가 연산자: " + (y++));

        System.out.println("==========================");
        System.out.println("x는" + x);
        System.out.println("y는" + y);

        int a = 100;
        int b = 100;
        System.out.println("전위 감소 연산자: " + (--a));
        System.out.println("후위 감소 연산자: " + (b--));
        System.out.println("전위 감소 연산자: " + (--a));
        System.out.println("후위 감소 연산자: " + (b--));
        System.out.println("전위 감소 연산자: " + (--a));
        System.out.println("후위 감소 연산자: " + (b--));

        System.out.println("==========================");
        System.out.println("a는" + a);
        System.out.println("b는" + b);
    }
}
