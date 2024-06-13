package Day8;

public class Child extends Parent{
    void investing(){
        this.money -= 1000;
        System.out.println("투자 진행: " + this.money);
    }
}
