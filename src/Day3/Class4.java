package Day3;

public class Class4 {
    public static void main(String[] args) {
//        int number = 10;
//
//        if (number > 10) {
//            System.out.println("number는 10보다 큽니다.");
//        } else if (number < 10) {
//            System.out.println("number는 10보다 작습니다.");
//            if(number > 5) {
//                System.out.println("number는 5보다 큽니다.");
//            }
//        } else {
//            System.out.println("number는 10입니다.");
//        }


//        int a = 5, b = 8;
//        if (a > b) {
//            System.out.println("a is greater than b");
//        } else if (a == b) {
//            System.out.println("a and b are equal");
//        } else {
//            System.out.println("a is less than b");
//        }

        // System.out.println(a > b? "a is greater than b" : (a == b? "a and b are equal" : "a is less than b"));

        // 1
        int x = 10;
        System.out.println(x > 0 ? "positive" : x < 0 ? "negative" : "0");

        // 2
        int score = 75;
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);

        // 3
        int year = 2023;
        if (year % 4 == 0 && (year % 100 != 0 && year % 400 == 0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }

        // 4
        int a = 10, b = 20, c = 30;
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        System.out.println(a > b ? a : (b > c ? b : c));

        // 5
        int passScore = 60, myScore = 75;
        if (myScore > passScore) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

    }
}
