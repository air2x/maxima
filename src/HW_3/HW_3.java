package HW_3;

import java.util.Locale;
import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        if (num < 5) {
            System.out.println("Число меньше 5");
        } else if (num > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }

        System.out.println("\nЗадание 2");
        System.out.println("Введите число");
        num = scanner.nextInt();
        if (num >= 50 && num <= 100) {
            System.out.println("Число " + num + " содержится в интервале.");
        } else {
            System.out.println("Число " + num + " не содержится в интервале.");
        }

        System.out.println("\nЗадание 3");
        System.out.println("Введите число");
        num = scanner.nextInt();
        if (num == 12 || num == 1 || num == 2) {
            System.out.println("Время года зима");
        } else if (num == 3 || num == 4 || num == 5) {
            System.out.println("Время года весна");
        } else if (num == 6 || num == 7 || num == 8) {
            System.out.println("Время года лето");
        } else if (num == 9 || num == 10 || num == 11) {
            System.out.println("Время года осень");
        } else {
            System.out.println("Такого месяца не существует");
        }

        System.out.println("\nЗадание 4");
        System.out.println("Введите число");
        num = scanner.nextInt();
        if (num > 0) {
            num *= 2;
            System.out.println("Введенное число положительное. Результат = " + num);
        } else if (num < 0) {
            num++;
            System.out.println("Введенное число отрицательное. Результат = " + num);
        } else {
            System.out.println("Введенное число " + num + ". Результат = " + num);
        }

        System.out.println("\nЗадание 6");
        System.out.println("Введите год");
        num = scanner.nextInt();
        int x;
        System.out.print("Количество дней в этом году: ");
        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            x = 366;
        } else {
            x = 365;
        }
        System.out.println(x);

        System.out.println("\nЗадание 7");
        System.out.println("Введите 1-ю сторону треугольника");
        int a = scanner.nextInt();
        System.out.println("Введите 2-ю сторону треугольника");
        int b = scanner.nextInt();
        System.out.println("Введите 3-ю сторону треугольника");
        int c = scanner.nextInt();
        if (a >= b + c || b >= c + a || c >= a + b) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.println("Треугольник существует");
        }

        System.out.println("\nЗадание 8");
        System.out.println("Введите время в минутах");
        double minutes = scanner.nextDouble();
        while (minutes > 5) {
            minutes -= 5;
        }
        if ((minutes > 0 && minutes < 3.0)) {
            System.out.println("Зеленый");
        } else if ((minutes >= 3.0 && minutes < 4.0)) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }
}