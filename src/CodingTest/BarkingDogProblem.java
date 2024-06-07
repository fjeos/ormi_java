package CodingTest;

import java.util.Scanner;

public class BarkingDogProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("짖었나요?");
        boolean barked = scanner.nextBoolean();
        System.out.println("몇 시에?");
        int hour = scanner.nextInt();
        System.out.println(barkingDogProblem(barked, hour));

        scanner.close();
    }

    public static String barkingDogProblem(boolean barked, int hour) {
        return barked && (hour < 7 || hour > 21) ? "짖으면 안돼!!" : "든든하군!";
       /* if (barked && (hour < 7 || hour > 21)) {
            return "짖으면 안돼!!";
        } else {
            return "든든하군!";
        }*/
    }
}
