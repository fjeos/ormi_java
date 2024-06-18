package WeeklyQuiz2;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    @Override
    public int calculatePrice() {
        int price = getPrice();
        // 제품의 브랜드가 Apple이면 인상된 가격 반환
        if (brand.equals("Apple")) {
            return price + (int)(price * 0.2);
        }
        else return price;
    }
}
