package HW_11;
//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку");
            list.add(sc.nextLine());
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < list.get(i - 1).length()) {
                System.out.println(i);
                break;
            } else if (i == list.size() - 1) {
                System.out.println("Список упорядоченный");
            }
        }
    }
}
