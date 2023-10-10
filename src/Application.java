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

        System.out.println("\nЗадача 3:" + "\na:");


    }
}