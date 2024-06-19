package WeeklyQuiz2;

public class MallTest {
    public static void main(String[] args) {
        Clothing hat = new Clothing("hat", 10000, 5, "XXL");
        Clothing dress = new Clothing("dress", 15000, 22, "S");
        Electronics computer = new Electronics("computer", 100000, 3, "LG");
        Electronics iPhone = new Electronics("IPhone", 2000000, 1, "Apple");
        Food milk = new Food("milk", 5000, 10, "8/30");
        Food candy = new Food("candy", 300, 40, "6/20");
        Food meat = new Food("meat", 45000, 5, "6/23");

        // 각 상품의 가격 출력
        System.out.println("모자의 가격: " + hat.calculatePrice());
        System.out.println("원피스의 가격: " + dress.calculatePrice());
        System.out.println("컴퓨터의 가격: " + computer.calculatePrice());
        System.out.println("아이폰의 가격: " + iPhone.calculatePrice());
        System.out.println("우유의 가격: " + milk.calculatePrice());
        System.out.println("사탕의 가격: " + candy.calculatePrice());
        System.out.println("고기의 가격: " + meat.calculatePrice());
        System.out.println();

        PremiumShoppingMall mall = new PremiumShoppingMall(3);
        // 상품 추가
        mall.addProduct(hat);
        mall.addProduct(dress);
        mall.addProduct(computer);
        mall.addProduct(iPhone);
        mall.addProduct(milk);
        mall.addProduct(candy);
        mall.addProduct(meat);
        System.out.println();

        // 전체 상품 목록 출력
        mall.displayProducts();
        System.out.println();

        // computer 상품 삭제 후 목록 출력
        mall.removeProduct(computer, computer.getName());
        mall.removeProduct(meat, meat.getName());
        System.out.println();
        mall.displayProducts();
        System.out.println();

        //  stock에 따른 주문 가능 여부 출력
        System.out.println(mall.checkOrderAvailability(hat) ? hat.getName() + "은(는) 주문이 가능합니다."
                                                            : hat.getName() + "은(는) 주문이 불가능합니다.");
        System.out.println(mall.checkOrderAvailability(milk) ? milk.getName() + "은(는) 주문이 가능합니다."
                                                            : milk.getName() + "은(는) 주문이 불가능합니다.");
        System.out.println(mall.checkOrderAvailability(dress) ? dress.getName() + "은(는) 주문이 가능합니다."
                                                            : dress.getName() + "은(는) 주문이 불가능합니다.");
        System.out.println(mall.checkOrderAvailability(iPhone) ? iPhone.getName() + "은(는) 주문이 가능합니다."
                                                            : iPhone.getName() + "은(는) 주문이 불가능합니다.");
        System.out.println();

        // removeProduct 오버로딩 테스트
        mall.removeProduct();
        mall.displayProducts();

    }
}