package Day8;

public abstract class AbstractAnimal {
    protected String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();

}
