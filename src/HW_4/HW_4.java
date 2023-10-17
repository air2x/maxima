package HW_4;

import java.util.Arrays;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

        System.out.println("\nЗадание 2");
        for (int i = 0; i < 10; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

        System.out.println("\nЗадание 3");
        System.out.println("Введите три числа");
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[1]);

        System.out.println("\nЗадание 4");
        int num = 0;
        while (true) {
            System.out.println("Введите число");
            int num2 = sc.nextInt();
            num += num2;
            if (num2 == -1) {
                break;
            }
        }
        System.out.println("Сумма введеных чисел = " + num);

        System.out.println("\nЗадание 5");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", j * i);
            }
            System.out.println();
        }

        System.out.println("\nЗадание 6");
        System.out.println("Введите имя");
        String name = sc.nextLine();
        System.out.println("Введите дату рождения: день, месяц, год");
        int[] birthdays = new int[3];
        for (int i = 0; i < birthdays.length; i++) {
            birthdays[i] = sc.nextInt();
        }
        System.out.println("Меня зовут " + name + ".\nЯ родился " + birthdays[0] + "." + birthdays[1] +
                    "." + birthdays[2]);
    }
}
