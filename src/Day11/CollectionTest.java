package Day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        /*arrayList.add("Java");
        arrayList.add("Spring");
        arrayList.add("Servlet/JSP");
        arrayList.add("DBMS");
        arrayList.add("JPA");

        System.out.println("총 객체 수: " + arrayList.size());
        System.out.println("=================");

        System.out.println("인덱스 2:" + arrayList.get(2));

        for(String str : arrayList) {
            System.out.println(str);
        }

        System.out.println(arrayList.contains("java"));

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(null);
        System.out.println(objects.isEmpty());
        objects.clear();
        System.out.println(objects.isEmpty());*/

        List<String> linkList = new LinkedList<>();

        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간: " + (endTime - startTime));
    }
}
