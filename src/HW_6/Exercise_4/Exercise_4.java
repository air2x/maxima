package HW_6.Exercise_4;

import java.util.Scanner;
    /*
    Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
    Вывести на экран полученную сумму.
     */
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
