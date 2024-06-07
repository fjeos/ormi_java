package Day5;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("정수를 입력하세요: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println("문자열을 입력하세요: ");
        String line = scan.nextLine();

        System.out.println("입력한 정수는 " + number + "입니다.");
        System.out.println("입력한 문자열은 " + line + "입니다.");*/


        System.out.println("계절을 맞춰보세요!");
        System.out.println("1 ~ 4 사이의 숫자를 입력해주세요: ");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                System.out.println("봄");
                break;
            case 2:
                System.out.println("여름");
                break;
            case 3:
                System.out.println("가을");
                break;
            case 4:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못된 입력입니다!");
                break;
        }
        scan.close();
    }
}
