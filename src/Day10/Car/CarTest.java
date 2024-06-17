package Day10.Car;

public class CarTest {
    public static void main(String[] args) {
        Car kia = new KiaCar();
        System.out.println(kia.getTire());
        System.out.println(kia.showEngine());
        System.out.println(kia.amountNavi());

        Car2<String> stringCar2 = new Car2<>();
        stringCar2.set("first car");
        System.out.println(stringCar2.get());
    }
}
