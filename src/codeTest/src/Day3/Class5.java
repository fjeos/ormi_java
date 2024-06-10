package Day3;

public class Class5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean result1 = (a > 5) && (b < 10);
        boolean result2 = (a > 5) || (b < 10);
        boolean result3 = !(a > 5);

        boolean x = true, y = false, z = true;
        if (x && !y) {
            System.out.println("조건 1 충족");
        }
        if (y && z || !x && !z) {
            System.out.println("조건 2 충족");
        }
        if (x || y || z) {
            System.out.println("적어도 하나는 참");
        }
        if (!(x || y || z)) {
            System.out.println("모두 거짓");
        }

        int data = 10;
        switch(data){
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            case 10:
                System.out.println("10입니다.");
                break;
            default:
                System.out.println("asdfsad");
        }

        String date = "수요일";
        switch(date){
            case "월요일":
                System.out.println("책 읽기");
                break;
            case "화요일":
                System.out.println("영화 보기");
                break;
            case "수요일":
                System.out.println("뮤지컬 보기");
                break;
            case "목요일":
                System.out.println("유튜브 보기");
                break;
            case "금요일":
                System.out.println("산책 가기");
                break;
            case "토요일":
                System.out.println("집안일 하기");
                break;
            case "일요일":
                System.out.println("할머니댁 방문하기");
                break;
            default:
                System.out.println("알 수 없는 요일");
                break;
        }

        // 1
        char grade = 'B';
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }

        // 2
        char operator = '/';
        int num1 = 10, num2 = 5;
        switch (operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }

        // 3
        String color = "blue";
        switch(color){
            case "red":
                System.out.println("Apple");
                break;
            case "green":
                System.out.println("grass");
                break;
            case "blue":
                System.out.println("Sky");
                break;
        }

        // 4
        int score = 88;
        switch (score / 10) {
            case 10, 9:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            default:
                System.out.println('F');

        }

        // 5
        String language = "Python";
        switch(language){
            case "Java":
                System.out.println("Java");
                break;
            case "Python":
                System.out.println("Python");
                break;
            case "C++":
                System.out.println("C++");
                break;
            case "JavaScript":
                System.out.println("JavaScript");
                break;
        }

    }
}
