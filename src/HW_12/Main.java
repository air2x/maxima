package HW_12;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fridge fridge = new Fridge();

        fridge.addProduct("Хлеб", 2);
        fridge.addProduct("Молоко", 2);
        fridge.addProduct("Огурец", 8);
        fridge.addProduct("Помидор", 20);


        fridge.printFridge();

        fridge.take("Огурец", 2);
        fridge.printFridge();

        fridge.addOrders("Молоко", 2);
        fridge.printFridge();
        fridge.addOrders("Кефир", 1);
        fridge.printFridge();

    }
}
