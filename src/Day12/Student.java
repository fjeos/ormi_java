package Day12;

import java.util.Objects;

public class Student {
    private String name;
    private int no;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, no);
    }
}
