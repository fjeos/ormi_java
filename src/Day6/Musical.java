package Day6;

public class Musical {

    String title;
    int price;
    String production;
    String location;

    // 생성자
    public Musical(String title, int price, String production, String location) {
        this.title = title;
        this.price = price;
        this.production = production;
        this.location = location;
    }

    // 제작사의 횡포
    public void productionsTyrannize(){
        price += 30000;
        System.out.println("응 티켓값 올릴거야~");
    }

    // 10% 할인
    public void giveCarrot(){
        price -= (int) (price * 0.1);
        System.out.println("옛다 할인ㅋ");
    }

    // 현재 티켓 가격 출력
    public void printPrice(){
        System.out.println("현재 티켓값: " + price + " 원");
    }
}
