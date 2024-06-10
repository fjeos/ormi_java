package Day4;

public class BreakContinue {
    public static void main(String[] args) {

        int number = 0;
        while (number < 10) {
            System.out.println("현재 숫자: " + number);
            if (number == 5) {
                System.out.println("5가 되었습니다.");
                break;
            }
            number++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 숫자: " + i);
            if (i == 5) {
                System.out.println("5가 되었습니다.");
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("현재 i의 값은 = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("현재 j의 값은 = " + j);
                if (j == 5) {
                    break;
                }
            }
        }

        for (int i = 1; i < 101; i++) {
            System.out.println("i: " + i);
            if (i == 50) {
                break;
            }
            for (int j = 2; j < 101; j++) {
                System.out.println("j: " + j);
                if (j == 80) {
                    break;
                }
            }
        }

        int number2 = 0;
        while (number2 < 10) {
            number2++;
            if (number2 == 3) {
                continue;
            }
            System.out.println("현재 값은 :" + number2);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("현재 값은 :" + i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    continue;
                }
                System.out.println(j);
            }
        }

        for (int i = 1; i < 11; i++) {
            if (i == 4 || i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
