package HW_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5
//  1. Создай список строк.
//  2. Добавь в него 5 строк с клавиатуры.
//  3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//  4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
public class EX_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listString = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку");
            listString.add(sc.nextLine());
        }


        for (String s: listString) {
            System.out.println(s);
        }
    }
}
