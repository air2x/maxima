package HW_6.Exercise_4;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int num = 0;
        System.out.println("Вводите числа, для остановки введите \"сумма\".");
        while(true) {
            str = sc.nextLine();
            if (str.equalsIgnoreCase("сумма")) {
                break;
            }
            num += Integer.parseInt(str);
        }
        System.out.println(num);
    }
}
