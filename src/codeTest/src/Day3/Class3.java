package Day3;

public class Class3 {
    public static void main(String[] args) {
        int score = 95;
        char grade = (score > 90 ? 'A' : 'B');

        String grade2 = (score == 95 && score % 5 == 0) ? "good" : "bad";
        System.out.println(grade2);

        if (score > 90) {
            grade = 'A';
        } else {
            grade = 'B';
        }
        System.out.println("당신의 학점은 : " + grade);
    }


}
