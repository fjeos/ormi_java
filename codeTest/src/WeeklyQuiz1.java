import java.util.Scanner;

public class WeeklyQuiz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
            int input = scan.nextInt();
            if (input == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
            int num1 = scan.nextInt();
            System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
            int num2 = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
                    break;
                default:
                    System.out.println("올바른 입력이 아닙니다.");
                    break;
            }
        }
    }
}
