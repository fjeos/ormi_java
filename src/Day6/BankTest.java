package Day6;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요: ");
        String accountNumber = scan.nextLine();
        System.out.println("소유자 이름을 입력하세요: ");
        String ownerName = scan.nextLine();
        BankAccount account = new BankAccount(accountNumber, ownerName);

        account.deposit(100000);
        account.withdraw(50000);

        account.printBalance();

        scan.close();
    }
}
