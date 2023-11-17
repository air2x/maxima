package HW_7.exercise_2;

import java.util.Arrays;

public class Category {
    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        setName(name);
        setProducts(products);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return getName() + Arrays.toString(getProducts());
    }
}
