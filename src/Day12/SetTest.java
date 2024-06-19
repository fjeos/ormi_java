package Day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // Set<Integer> integerSet = new HashSet<>();

        /*integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);

        System.out.println("size " + integerSet.size());

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        for (int i : integerSet) {
            System.out.println(i);
        }*/

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Java");
        stringSet.add("Spring");
        stringSet.add("JSP");
        stringSet.add("Java");
        stringSet.add("DBMS");
        System.out.println(stringSet.size());

        stringSet.remove("Java");

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        if (stringSet.isEmpty()) {
            System.out.println("비었습니다.");
        } else {
            System.out.println("비지 않았습니다.");
        }
    }
}
