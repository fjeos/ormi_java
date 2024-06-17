package WeeklyQuiz2;

public class Clothing extends Product{
    private String size;

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        if(!size.equals("S") && !size.equals("M")) {
            return getPrice() + (int)(getPrice()* 0.2);
        }
        else return getPrice();
    }
}
