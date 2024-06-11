package Day6;

public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;
    // 계좌 생성자
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }
    // 입금
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    // 출금
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }

    }
    // 잔액
    public void printBalance() {
        System.out.println("현재 잔액: " + balance);
    }

}
