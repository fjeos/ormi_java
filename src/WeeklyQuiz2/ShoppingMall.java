package WeeklyQuiz2;

public class ShoppingMall {
    private Product[] products;
    private int count;

    public ShoppingMall(int size) {
        this.products = new Product[size];
    }

    public void addProduct(Product product){
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            Product[] newProducts = new Product[products.length];
            for (int i = 0; i < products.length; i++) {
                newProducts[i] = products[i];
            }
            newProducts[count++] = product;
            products = newProducts;
        }
    }

    public void removeProduct(Product product){

    }
}
