package WeeklyQuiz2;

import java.util.Arrays;

public abstract class ShoppingMall {
    private Product[] products;
    private int count;

    public ShoppingMall(int size) {
        this.products = new Product[size];
    }

    public void addProduct(Product product) {
        if (count >= products.length) {
            products = Arrays.copyOf(products, products.length * 2);
        }
        products[count] = product;
        count++;
        System.out.println("상품 추가: " + product.getName());
        System.out.println("현재 상품 총량: " + products.length);
    }

    public void removeProduct(Product product) {
        if (products.length > 0) {
            int index = Arrays.asList(products).indexOf(product);
            System.out.println("상품 삭제: " + products[index].getName());
            for (int i = index; i < products.length - 1; i++) {
                products[i] = products[i + 1];
            }
            // 마지막 요소 제거
            products = Arrays.copyOf(products, products.length - 1);
        } else {
            System.out.println("쇼핑몰에 상품이 없습니다.");
        }
    }

    public void displayProducts() {
        System.out.println("======현재 상품 목록======");
        int index = 0;
        while (index < products.length && products[index] != null) {
            System.out.println("상품명: " + products[index].getName() +
                    " 가격: " + products[index].getPrice() +
                    " 재고수량: " + products[index].getStock());
            index++;
        }
    }

    public abstract boolean checkOrderAvailability(Product product);
}
