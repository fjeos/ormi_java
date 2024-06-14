package Day9;

import java.util.Scanner;

public class ErrorException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int result = i / 0;
            // int result = 10 / 0;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("0으로 나눌 수 업습니다.");
        } finally {
            System.out.println("이건 예외 여부와 상관 없이 항상 실행됩니다.");
            System.out.println("스캐너를 종료합니다.");
            scanner.close();
        }
        System.out.println("정상적으로 종료되었습니다.");

        /*try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("정상적으로 종료되었습니다.");
    }

    private static int divide(int a, int b) { // throws ArithmeticException{
        // return a / b;
        if (a / b == 0) {
            throw new ArithmeticException();
        }
        return a / b;*/
    }
}
