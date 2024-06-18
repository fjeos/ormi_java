package Day11.Generic;

public class ProductTest {
    public static void main(String[] args) {

        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("smart TV");
        product.setCompany("Samsung");

        StorageImpl<Tv> tvStorage = new StorageImpl<>(100);
        tvStorage.add(new Tv(), 0);

    }
}
