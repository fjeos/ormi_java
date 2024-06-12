package Day7.car;

public class CarTest {
    public static void main(String[] args) {
        // Car car = new Car(2);
        Car car = new Car();
        car.setSpeed(-100);
        car.checkSpeed();
        car.checkGear();
        car.setSpeed(100);
        car.checkGear();
        car.setSpeed(0);
        car.checkGear();
        car.setSpeed(83);
        car.checkGear();
    }
}
