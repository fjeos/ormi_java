package Day10;

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public boolean isIns() {
        return t instanceof String;
    }

}
