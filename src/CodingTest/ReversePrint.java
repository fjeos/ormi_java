package CodingTest;

public class ReversePrint {
    public static void main(String[] args) {

        String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
        printString(someTxt);
    }

    static void printString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
