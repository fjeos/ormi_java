package Day4;

public class TwoFor {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // 2단
        for (int i = 1; i < 10; i++) {
            System.out.println(2 + " x " + i + " = " + (i * 2));
        }

        // 구구단
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + "= " + (i * j));
            }
        }

        for (int i = 19; i > 0; i--) {
            System.out.println(19 + " x " + i + "= " + (19 * i));
        }
    }
}
