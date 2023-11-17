package HW_11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//1
//Введи с клавиатуры 5 слов в HashSet.
// Удали 3-ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
public class EX_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку");
            set.add(sc.nextLine());
        }
        set.remove(2);
        System.out.println(set);
        for (int i = set.size() - 1; i > 0; i++) {
            System.out.println(set.getClass());
        }
    }
}
