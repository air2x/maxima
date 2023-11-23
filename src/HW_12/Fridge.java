package HW_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fridge {
    private final Map<String, Integer> products = new HashMap<>();
    private final Map<String, Integer> orders = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct(String nameProduct, int count) {
        if (products.containsKey(nameProduct)) {
            products.put(nameProduct, count + products.get(nameProduct));
        } else {
            products.put(nameProduct, count);
        }
    }

    public void take(String nameProduct, int count) {
        if (!products.containsKey(nameProduct)) {
            System.out.println(nameProduct + " нет в холодильнике");
        } else {
            if (products.get(nameProduct) < count) {
                System.out.println(nameProduct + " " + count + " столько нет, в холодильнике всего " +
                        products.get(nameProduct) + " штук. \nСколько хотите взять?");
                while (true) {
                    int takeCount = sc.nextInt();
                    if (takeCount <= products.get(nameProduct)) {
                        products.put(nameProduct, products.get(nameProduct) - takeCount);
                        break;
                    } else {
                        System.out.println(nameProduct + " " + takeCount + " столько нет, в холодильнике всего " +
                                products.get(nameProduct) + " штук. \nСколько хотите взять?");
                    }
                }
            } else if (products.get(nameProduct) == count) {
                products.remove(nameProduct);
                System.out.println(nameProduct + " закончился");
            } else {
                products.put(nameProduct, products.get(nameProduct) - count);
                System.out.println(nameProduct + " взяли " + count + " шт., в холодильнике осталось " +
                        products.get(nameProduct) + " штук");
            }
        }
    }

    public void addOrders(String name, int count) throws InterruptedException {
        if (products.containsKey(name)) {
            System.out.println(name + " уже есть " + products.get(name) + " штук.\nХотите добавить еще? " +
                    "Введите количество, которое хотите добавить в холодильник, если не хотите добавлять, то введите 0");
            int takeCount = sc.nextInt();
            if (takeCount > 0) {
                orders.put(name, takeCount);
            }
        } else {
            orders.put(name, count);
        }
        System.out.println("Уснул на 10 сек.");
        Thread.sleep(10000);
        transferOrderInFridges(orders);
        System.out.println("Желаемые продукты добавлены в холодильник");
    }

    private void transferOrderInFridges(Map<String, Integer> map) {
        products.putAll(map);
    }

    public void printFridge() {
        if (products.isEmpty()) {
            System.out.println("Холодильник пустой");
        } else {
            for (Map.Entry<String, Integer> product : products.entrySet()) {
                System.out.println(product);
            }
        }
    }
}
