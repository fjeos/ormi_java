package Day10.Interface;

public class ImpleC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("A실행");
    }

    @Override
    public void methodB() {
        System.out.println("B실행");
    }

    @Override
    public void methodC() {
        System.out.println("C실행");
    }
}
