package WeeklyQuiz2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends Product{
    private String expirationDate;

    public Food(String name, int price, int stock, String date) {
        super(name, price, stock);
        this.expirationDate = date;
    }

    /*@Override
    public int calculatePrice() {

    }*/
}
