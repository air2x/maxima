package HW_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. Введи с клавиатуры 10 слов в список строк.
//2. Метод doubleValues должен удваивать слова по принципу:
//"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//3. Выведи результат на экран, каждое значение с новой строки.
public class EX_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку");
            list.add(sc.nextLine());
        }
        list = doubleValues(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> doubleValues(List<String> list) {
        List<String> tempList = new ArrayList<>();
        for (String s : list) {
            tempList.add(s);
            tempList.add(s);
        }
        return tempList;
    }
}
