package Day6;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("김승조", 0101000000, 10000 ,10);
        // person1.sayHello();
        Person person2 = new Person("김맥스", 0101001110, 200000, 20);
        /*person2.sayHello();

        person1.sayMoney();
        person2.sayMoney();*/

        Student student = new Student();
        person1.teaching(student);
        person1.cheating(student);
    }
}
