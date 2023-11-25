package HW_11;

import java.util.*;

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
        System.out.println("HashSet = " + set); // проверка для себя для наглядности
        List<String> tempList = new ArrayList<>(set);
        System.out.println("List = " + tempList);  // проверка для себя для наглядности
        tempList.remove(2);
        set.clear();
        set.addAll(tempList);
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
}
