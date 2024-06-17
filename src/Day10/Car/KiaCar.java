package Day10.Car;

public class KiaCar implements Car {

    @Override
    public String showEngine() {
        return "엔진 이름";
    }
    @Override
    public int amountNavi() {
        return 50000;
    }
    @Override
    public String getTire() {
        return "누구네 타이어";
    }
}
