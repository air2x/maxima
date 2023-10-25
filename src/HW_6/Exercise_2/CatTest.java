package HW_6.Exercise_2;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasiliy");
        Cat cat2 = new Cat("Murzik", 8, 15);
        Cat cat3 = new Cat("Barsik", 3);
        Cat cat4 = new Cat(5, "White");
        Cat cat5 = new Cat("Lenina", "Black", 6);
        System.out.println(cat1.toString() + "\n" + cat2.toString() + "\n" + cat3.toString() + "\n" + cat4.toString()
                    + "\n" + cat5.toString());
    }
}
