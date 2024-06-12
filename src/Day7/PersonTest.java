package Day7;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("승조", 25);
        Person person2 = new Person("max", 21);

        person1.sayHello();
        person1.introduce();

        person2.sayHello();
        person2.introduce();

        System.out.println("주민 번호: " + Person.JUMIN_NUMBER);
        System.out.println("성별: " + Person.GENDER);
        System.out.println("키: " + Person.HEIGHT);
        System.out.println("태어난 곳: " + Person.BORN);

        Person okay = new Person("okay", 25);
        okay.testMethod();
    }
}
