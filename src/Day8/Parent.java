package Day8;

public class Parent {
    int money = 5000;

    void saveMoney(){
        this.money += 10000;
        System.out.println("현재 money: " + this.money);
    }
}
