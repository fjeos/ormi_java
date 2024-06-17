package Day10;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Animal> stringArrayList = new ArrayList<>();
        stringArrayList.add(new Lion());

        Box<String> stringBox = new Box<>();
        stringBox.set("123");
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        System.out.println(integerBox.isIns());
        System.out.println(stringBox.isIns());

        Box<Integer> boxing = Util.boxing(100);


    }
}
