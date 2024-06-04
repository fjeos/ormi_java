package Day4;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5){
            System.out.println("현재 i의 값은 = " + i);
            i++;
        }

        int count = 10;
        while (count >= 0){
            System.out.println("count: " + count--);
        }
        System.out.println("카운트 종료");

        // 1
        int sum = 0, start = 1;
        while (start < 101){
            sum += start;
            start++;
        }
        System.out.println("sum = " + sum);

        // 2
        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int summ = 0, index = 0;
        while (index < numbers.length) {
            summ += numbers[index];
            index++;
        }
        System.out.println("평균: " + summ / numbers.length);



    }
}
