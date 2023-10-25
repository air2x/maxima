package HW_6.Exercise_5;

import java.util.Scanner;

/*
    Написать программу, которая:
    1. считывает с консоли число N, которое должно быть больше 0
    2. потом считывает N чисел с консоли
    3. выводит на экран максимальное из введенных N чисел.
     */
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int num = -1;
        while (num <= 0) {
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Введенное число не положительное");
            }
        }
        int[] nums = new int[num];
        System.out.println("Введите " + num + " чисел.");
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        int numMax = nums[0];
        for (int i : nums) {
            numMax = Math.max(i, numMax);
        }
        System.out.println("Max = " + numMax);
    }
}
