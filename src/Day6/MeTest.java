package Day6;

public class MeTest {
    public static void main(String[] args) {

        Me me = new Me("유나영", "무직");
        Musical musical = new Musical("프랑켄슈타인", 170000, "EMK", "블루스퀘어");

        // 현재 티켓 값
        musical.printPrice();
        me.ticketing(musical.price);

        System.out.println();

        // 티켓값이 부족하여 돈을 번다
        me.working(10000);
        me.working(30000);

        System.out.println();

        // 제작사의 횡포
        musical.productionsTyrannize();
        musical.printPrice();
        me.ticketing(musical.price);

        System.out.println();

        // 취업 성공!
        me.upgrade("개발자");
        // musical.giveCarrot();
        me.ticketing(musical.price);
    }
}
