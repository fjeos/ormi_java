package Day8;

public class AbstractDog extends AbstractAnimal{
    public AbstractDog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

}
