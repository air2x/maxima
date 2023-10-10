public class Application {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int result = -a + b - c + d;
        System.out.println(result);

        System.out.println("\nЗадача 2:");
        double productA = 1000;
        double productB = 500;
        double discount = (productA + productB) * 0.1;
        double sum = productA + productB - discount;
        System.out.println("Cумма покупки со скидкой: " + sum + "\nСумма скидки: " + discount);

        System.out.println("\nЗадача 3:");
        productA = 200;
        productB = 30;
        discount = 0.15;
        double productADiscount = productA * discount;
        sum = 10 * (productA - productADiscount) + 2 * productB;
        System.out.println("a: Сумма = " + sum);

        productA = 500;
        productB = 50;
        discount = 0.5;
        productADiscount = productA * discount;
        sum = 7 * (productA - productADiscount) + productB;
        System.out.println("б: Сумма = " + sum);

        productA = 300;
        productB = 20;
        discount = 0.1;
        productADiscount = productA * discount;
        sum = 2 * (productA - productADiscount) + 3 * productB;
        System.out.println("в: Сумма = " + sum);
    }
}