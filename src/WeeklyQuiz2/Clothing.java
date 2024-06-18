package WeeklyQuiz2;

public class Clothing extends Product{
    private String size;

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        // size 문자열에 L이 들어가 있으면 -> L, XL, XXL...등 처리
        if(size.contains("L")) {
            return getPrice() + (int)(getPrice()* 0.1);
        }
        else return getPrice();
    }
}
