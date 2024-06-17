package Day10.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone applePhone = new ApplePhone();
        Phone samsumgPhone = new SamSungPhone();

        System.out.println(applePhone.call());
        System.out.println(samsumgPhone.call());
        System.out.println(applePhone.answerThePhone());
        System.out.println(samsumgPhone.answerThePhone());
    }
}
