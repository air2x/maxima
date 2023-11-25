package HW_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6
//  1. Создай список строк.
//  2. Добавь в него 10 строчек с клавиатуры.
//  3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//     Если таких строк несколько, то должны быть учтены самые первые из них.
//  4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
public class EX_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listString = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку");
            listString.add(sc.nextLine());
        }
        int lengthMin = listString.get(0).length();
        int lengthMax = listString.get(0).length();
        for (String s : listString) {
            if (lengthMin > s.length()) {
                lengthMin = s.length();
            }
            if (lengthMax < s.length()) {
                lengthMax = s.length();
            }
        }
        for (String s : listString) {
            if (s.length() == lengthMin || s.length() == lengthMax) {
                System.out.println(s);
                break;
            }
        }
    }
}
