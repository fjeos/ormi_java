package Day1;

import java.util.Arrays;
import java.util.List;

public class TypeFeatures implements TestInterface{
    public static void main(String[] args) {
        // 배열
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        List<Integer> list = Arrays.asList(1);
        System.out.println(list.get(0));
    }

    @Override
    public void test() {

    }
}
