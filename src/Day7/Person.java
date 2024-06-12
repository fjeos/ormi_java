package Day7;

public class Person {

    private String name2;
    String name;
    int age;
    static final String JUMIN_NUMBER = "1234-5678";
    static final int HEIGHT = 150;
    static final String GENDER = "남";
    static final String BORN = "대한민국";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName2() {
        return this.name2;
    }

    public void sayHello() {
        System.out.println("Hello my name is " + this.name);
    }

    public void introduce() {
        System.out.println("I am " + this.age + "years old.");
    }

    protected void testMethod(){
        System.out.println("test");
    }
}
