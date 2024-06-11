package Day6;

public class Me {
    String name;
    String job;
    int balance;

    // 생성자
    public Me(String name, String job){
        this.name = name;
        this.job = job;
        this.balance = 50000;
    }

    // 일을 하여 amount만큼 돈을 벎
    public void working(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("티켓값 버는 중...");
        }
    }

    // job으로 취직 성공
    public void upgrade(String job){
        this.job = job;
        System.out.println(name + "은 " + job + "(으)로 전직하였다!");
        balance += 100000;
    }

    // amount 액수의 뮤지컬 예매 도전
    public void ticketing(int amount) {
        System.out.print("티켓팅 도전 !!  ==>  ");
        if (amount > balance){
            System.out.println("잔액이 부족합니다. 관극이 불가합니다.");
            System.out.println("현재 잔액: " + balance);
        }
        else {
            System.out.println("와! 관극이다!");
            balance -= amount;
            System.out.println("잔액: " + balance);
        }
    }
}
