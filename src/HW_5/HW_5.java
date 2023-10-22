package HW_5;

import java.util.Arrays;
import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Введите 8 строк");
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        for (int i = 0; i < 8; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);
        }

        System.out.println("Задание 2");
        System.out.println("Введите 10 чисел");
        int[] nums = new int[10];
        fillInt(nums);
        int numMax = nums[0];
        for (int i : nums) {
            numMax = Math.max(numMax, i);
        }
        System.out.println("Максимальное число в массиве " + numMax);

        System.out.println("Задание 3");
        String[] str2 = new String[10];
        int[] nums2 = new int[10];
        System.out.println("Введите 10 строк");
        for (int i = 0; i < str2.length; i++) {
            str2[i] = sc.next();
            nums2[i] = str2[i].length();
        }
        System.out.println(Arrays.toString(str2) + "\n" + Arrays.toString(nums2));

        System.out.println("Задание 4");
        System.out.println("Введите 10 чисел");
        int[] nums3 = new int[10];
        fillInt(nums3);
        printReverse(nums3);

        System.out.println("Задание 5");
        System.out.println("Введите 20 чисел");
        int[] nums4 = new int[20];
        fillInt(nums4);
        int[] nums5 = Arrays.copyOfRange(nums4, 0, nums4.length / 2);
        int[] nums6 = Arrays.copyOfRange(nums4, nums4.length / 2, nums4.length);
        for (int i : nums6) {
            System.out.println(i);
        }

        System.out.println("Задание 6");
        System.out.println("Введите 20 чисел");
        int[] nums7 = new int[20];
        fillInt(nums7);
        int numMin = nums7[0];
        int numMax2 = nums7[0];
        for (int i : nums7) {
            numMax2 = Math.max(numMax2, i);
            numMin = Math.min(numMin, i);
        }
        System.out.println("Min = " + numMin + " Max = " + numMax2);

        System.out.println("Задание 7");
        System.out.println("Введите 20 чисел");
        int[] nums8 = new int[20];
        fillInt(nums8);
        Arrays.sort(nums8);
        printReverse(nums8);
    }

    public static void fillInt(int[] nums) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
    }

    public static void printReverse(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}
