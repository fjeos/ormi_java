package Day12;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {
    public static void main(String[] args) {
        // Map<String, Integer> map = new HashMap<>();
        Map<String, List<String>> map = new HashMap<>();
        List<String> stringList = new ArrayList<>();

         /*map.put("홍길동", 30);
        map.put("홍길동", 40);
        System.out.println(map.get("홍길동"));
        System.out.println(map.remove("홍길동"));*/


        stringList.add("홍길동");
        stringList.add("홍길동");
        stringList.add("홍길동");
        map.put("키1", stringList);

        Set<String> strings = map.keySet();
        System.out.println(strings.size());

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            List<String> stringList1 = map.get(next);
            System.out.println(stringList1);
        }

        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key);
            System.out.println("========");
            System.out.println(value);
        }
    }
}
