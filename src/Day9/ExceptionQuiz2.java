package Day9;

import java.util.Scanner;

public class ExceptionQuiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("배열의 크기를 입력하세요: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];
            System.out.println("배열의 값을 입력하세요.");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
            System.out.println("원하는 인덱스를 입력하세요: ");
            int index = scanner.nextInt();
            System.out.println("numbres[" + index + "]: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 크기를 벗어났습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
        }
    }
}
