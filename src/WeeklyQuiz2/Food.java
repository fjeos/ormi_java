package WeeklyQuiz2;

import java.util.Calendar;

public class Food extends Product {
    private final String expirationDate;

    public Food(String name, int price, int stock, String date) {
        super(name, price, stock);
        this.expirationDate = date;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public int calculatePrice() {
        // Calendar로부터 오늘 날짜의 월, 일을 가져옴
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);

        // expirationDate를 /로 구분하여 월, 일로 나눔
        String[] exDate = this.expirationDate.split("/");
        int exMonth = Integer.parseInt(exDate[0]);
        int exDay = Integer.parseInt(exDate[1]);

        // 현재 월과 유통기한 만료 월이 같고
        if (month == exMonth) {
            // 일수 차이가 7일 이하면 할인된 가격 반환
            if (Math.abs(exDay - day) <= 7) {
                return (int) (this.getPrice() - this.getPrice() * 0.2);
            } else return this.getPrice();
        } else return this.getPrice();  // 현재 월과 유통기한 만료 월이 다르면 현재 가격 반환
    }
}
