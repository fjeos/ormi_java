package WeeklyQuiz2;

import java.util.Calendar;

public class Food extends Product {
    private String expirationDate;

    public Food(String name, int price, int stock, String date) {
        super(name, price, stock);
        this.expirationDate = date;
    }

    @Override
    public int calculatePrice() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        String[] exDate = this.expirationDate.split("/");
        int exMonth = Integer.parseInt(exDate[0]);
        int exDay = Integer.parseInt(exDate[1]);

        if (month == exMonth) {
            if (Math.abs(exDay - day) % 30 <= 7) {
                return (int) (this.getPrice() - this.getPrice() * 0.2);
            } else return this.getPrice();
        } else return this.getPrice();
    }
}
