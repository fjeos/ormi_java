package CodingTest;

public class SaeDal {
    /*
    * 정수 n이 주어졌을 때, 숫자를 문자열 형태로 변환하고 뒤에 "!"를 붙여 반환하세요.
    예를 들어, 정수가 13인 경우 이 메서드는 "13!"을 반환해야 합니다.
    하지만, 숫자가 3으로 나누어 떨어지면 숫자 대신 "새콤!"를 반환하고,
    5로 나누어 떨어지면 "달콤!"를 반환하며, 3과 5 모두로 나누어 떨어지면
    "새콤달콤!"를 반환해야 합니다.

    secomDalcom(1)   ---> "1!"
    secomDalcom(2)   ---> "2!"
    secomDalcom(3)   ---> "새콤!"*/
    public static void main(String[] args) {
        System.out.println(secomDalcom(1));
        System.out.println(secomDalcom(2));
        System.out.println(secomDalcom(3));
        System.out.println(secomDalcom(4));
        System.out.println(secomDalcom(5));
        System.out.println(secomDalcom(6));
        System.out.println(secomDalcom(7));
        System.out.println(secomDalcom(8));
        System.out.println(secomDalcom(9));
        System.out.println(secomDalcom(10));
        System.out.println(secomDalcom(15));
        System.out.println(secomDalcom(20));
        System.out.println(secomDalcom(21));
        System.out.println(secomDalcom(30));
    }

    static String secomDalcom(int num) {
        // 강사님 ver.
        boolean secom = num % 3 == 0;
        boolean dalcom = num % 5 == 0;

        if (secom && dalcom) return "새콤달콤!";
        else if (secom) return "새콤!";
        else if (dalcom) return "달콤!";
        else return num + "!";

        // 내 풀이
        // return num % 15 == 0 ? "새콤달콤!" : num % 3 == 0 ? "새콤!" : num % 5 == 0 ? "달콤!" : num + "!";
    }
}
