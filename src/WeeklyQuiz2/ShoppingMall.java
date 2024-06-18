package WeeklyQuiz2;

import java.util.Arrays;

public abstract class ShoppingMall {
    private Product[] products;

    // 현재 배열에 들어있는 요소 수를 카운트하는 변수
    private int count;

    // 생성자
    public ShoppingMall(int size) {
        this.products = new Product[size];
    }

    // 상품 추가
    public void addProduct(Product product) {
        //  배열의 요소 수가 products의 길이보다 크거나 같아지면 배열의 길이를 두 배로 늘림
        if (count >= products.length) {
            products = Arrays.copyOf(products, products.length * 2);
        }
        products[count] = product;
        count++;
        System.out.println("상품 추가: " + product.getName());
        System.out.println("현재 상품 총량: " + products.length);
    }

    // 상품 삭제
    public void removeProduct(Product product, String name) {
        // 삭제할 상품이 있을 때에만 삭제 진행
        if (products.length > 0) {
            int index = Arrays.asList(products).indexOf(product);
            System.out.println("상품 삭제: " + products[index].getName());

            // 뒤의 객체를 앞으로 옮겨 삭제된 것 같은 효과
            for (int i = index; i < products.length - 1; i++) {
                products[i] = products[i + 1];
            }
            // 마지막 요소 제거
            products = Arrays.copyOf(products, products.length - 1);
        } else {
            System.out.println("쇼핑몰에 상품이 없습니다.");
        }
    }

    // 상품 목룍 출력
    public void displayProducts() {
        System.out.println("======현재 상품 목록======");
        int index = 0;
        while (index < products.length && products[index] != null) {
            Product product = products[index];
            System.out.print("상품명: " + product.getName() +
                    " 가격: " + product.getPrice() +
                    " 재고수량: " + product.getStock()
            );
            if (product instanceof Food) {
                System.out.println(" 유통기한: " + ((Food) product).getExpirationDate());
            } else if (product instanceof Electronics){
                System.out.println(" 제조사: " + ((Electronics) product).getBrand());
            } else{
                System.out.println(" 사이즈: " + ((Clothing)product).getSize());
            }

            index++;
        }
    }

    // 추상 메서드 선언
    public abstract boolean checkOrderAvailability(Product product);
}
