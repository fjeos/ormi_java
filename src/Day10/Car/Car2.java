package Day10.Car;

public class Car2<T> {
    private T t;
    public void set(T t){
        this.t = t;
    }
    public T get() {
        return this.t;
    }
}
