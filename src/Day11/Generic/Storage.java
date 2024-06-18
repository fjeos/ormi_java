package Day11.Generic;

public interface Storage<T>{
    void add(T item, int index);

    T get(int index);
}
