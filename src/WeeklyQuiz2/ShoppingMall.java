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

    // addProduct 오버로딩
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

    // removeProduct 오버로딩
    public void removeProduct(Product product) {
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

    // displayProducts 오버로딩
    public void displayProducts() {
        System.out.println("======현재 상품 목록======");
        int index = 0;
        while (index < products.length && products[index] != null) {
            System.out.println("상품명: " + products[index].getName() +
                                " 가격: " + products[index].getPrice() +
                                " 재고수량: " + products[index].getStock()
            );
            index++;
        }
    }

    // 추상 메서드 선언
    public abstract boolean checkOrderAvailability(Product product);
}
