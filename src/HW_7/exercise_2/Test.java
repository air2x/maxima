package HW_7.exercise_2;

public class Test {
    public static void main(String[] args) {
        Product tomato = new Product("Помидор", 50, 4.2);
        Product cucumber = new Product("Огурец", 20, 3.5);
        Product onion = new Product("Лук", 15, 4.8);
        Product pork = new Product("Свинина", 400, 2.7);
        Product beef = new Product("Говядина", 720, 4.9);
        Product chicken = new Product("Курица", 250, 4.1);

        Category vegetables = new Category("Овощи", new Product[]{tomato, cucumber, onion});
        Category meets = new Category("Мясо", new Product[]{pork, beef, chicken});
        Basket basket = new Basket(new Product[]{tomato, cucumber, onion, pork, beef, chicken});
        User user1 = new User("admin111", "DWSxs324sfdcx", basket);
        System.out.println(vegetables + "\n" + meets);
        System.out.println(user1.toString());
    }
}
