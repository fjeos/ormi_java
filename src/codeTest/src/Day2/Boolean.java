package Day2;

public class Boolean {
    public static void main(String[] args) {
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("하늘에서 비가 내려와요");
        }
        if (!isRaining) {
            System.out.println("🙄");
        }

        boolean isSunny = false;

        if (!isSunny) {
            System.out.println("날씨가 맑아요");
        } else {
            System.out.println("집에서 쉬어야죠");
        }

    }
}
