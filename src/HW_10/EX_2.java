package HW_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2
//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую длинную строку в списке.
//4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
public class EX_2 {
    public static void main(String[] args) {
        System.out.println("\nЗадание 2");
        Scanner sc = new Scanner(System.in);
        List<String> listString = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку");
            listString.add(sc.nextLine());
        }
        int lenghtString = listString.get(0).length();
        for (int i = 1; i < listString.size(); i++) {
            int j = listString.get(i).length();
            if (lenghtString < j) {
                lenghtString = j;
            }
        }
        for (String s : listString) {
            int j = s.length();
            if (lenghtString == j) {
                System.out.println(s);
            }
        }
    }
}
