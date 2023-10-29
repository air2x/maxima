package HW_7.exercise_2;

import java.util.Arrays;

public class Basket {
    private Product[] products;

    public Basket(Product[] products) {
        setProducts(products);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return Arrays.toString(getProducts());
    }
}
