package Day9;

import java.util.Scanner;

public class ExceptionQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
        }
    }

}
