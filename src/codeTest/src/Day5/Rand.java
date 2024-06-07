package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Random random = new Random();

        int k = random.nextInt();

        System.out.println(k);

        ArrayList<Integer> lotto = new ArrayList<>();
        while (lotto.size() != 6) {
            int n = random.nextInt(45) + 1;
            // 없으면 넣는게 더 깔끔
            if (!lotto.contains(n)) {
                lotto.add(n);
            }
        }

        Collections.sort(lotto);
        System.out.print("로또 번호: ");
        for (Integer i : lotto) {
            System.out.print("[" + i + "] ");
        }

        Scanner scan = new Scanner(System.in);
        int target = random.nextInt(100) + 1;

        while (true) {
            System.out.println("숫자를 맞춰보세요!: ");
            int number = scan.nextInt();

            if (number == target) {
                System.out.println("정답입니다!");
                break;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
        scan.nextLine();

        System.out.println("영화 제목을 입력하세요: ");
        String title = scan.nextLine();
        System.out.println("관람 인원을 입력하세요: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println("예매자 이름을 입력하세요: ");
        String name = scan.nextLine();
        System.out.println("예매자 전화번호를 입력하세요: ");
        String phone = scan.nextLine();

        System.out.println("===== 영화 티켓 예매 정보 =====");
        System.out.println("영화 제목: " + title);
        System.out.println("관람 인원: " + number + "명");
        System.out.println("예매자 이름: " + name);
        System.out.println("예매자 전화번호: " + phone);
        System.out.println("총 결제 금액: " + (10000 * number) + "원");

        scan.close();
    }
}
