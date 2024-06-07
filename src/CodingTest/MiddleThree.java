package CodingTest;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요:");
        String str = scan.nextLine();
        System.out.println(getMiddleThree(str));

        scan.close();
    }

    public static String getMiddleThree(String str) {
        int length = str.length();
        if (length < 4) {
            return str;
        } else if (length % 2 != 0) {
            return str.substring((length / 2) - 1, (length / 2) + 2);
        }
        return "even string";
    }
}