package HW_7.exercise_2;

public class Product {
    private String name;
    private int price;
    private double rating;

    public Product(String name, int price, double rating) {
        setName(name);
        setPrice(price);
        setRating(rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Error");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Error");
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating > 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return getName() + " Цена: " + getPrice() + " Рейтинг: " + getRating();
    }
}
