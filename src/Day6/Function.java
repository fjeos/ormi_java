package Day6;

public class Function {
    public static void main(String[] args) {
        okay(1, 2);

        /*Function2 function2 = new Function2();
        System.out.println(function2.b);
        System.out.println(function2.good());*/
        Function2.call();

    }

    static int okay(int a, int b) {
        System.out.println(a + b);
        return 1;
    }
    static int add(int a, int b){
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static int div(int a, int b){
        return a / b;
    }

    static boolean login(String email, String pw){
        return true;
    }
}
