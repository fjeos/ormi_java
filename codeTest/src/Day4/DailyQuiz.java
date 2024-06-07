package Day4;

public class DailyQuiz {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            if(count == 10000){
                break;
            }
            count++;
        }
        System.out.println("count = " + count);

        for(int i = 9; i> 1; i--){
            for (int j = 9; j > 0; j--){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
