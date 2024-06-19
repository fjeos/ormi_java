package Day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapQuiz {
    public static void main(String[] args) {
        Map<Student, Integer> students = new HashMap<>();

        students.put(new Student("홍길동", 1), 30);
        students.put(new Student("홍길동2", 2), 90);
        students.put(new Student("홍길동3", 3), 40);
        students.put(new Student("홍길동4", 4), 70);
        students.put(new Student("홍길동5", 5), 10);
        students.put(new Student("홍길동6", 6), 20);

        Set<Entry<Student, Integer>> entries = students.entrySet();
        for (Entry<Student, Integer> entry : entries) {
            String name = entry.getKey().getName();
            Integer value = entry.getValue();
            System.out.println("키: " + name+ " 값: " + value);
        }
    }
}
