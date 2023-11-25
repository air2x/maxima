package HW_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1. Создай список из слов HashSet "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.
public class EX_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            tempList.add(list.get(i));
            tempList.add(list.get(i) + " именно");
        }
        list = tempList;
        for (String s : list) {
            System.out.println(s);
        }

//        Set<String> set = new HashSet<>();
//        set.add("мама");
//        set.add("мыла");
//        set.add("раму");
//        System.out.println(set);
//        List<String> tempList = new ArrayList<>();
//        for (String s : set) {
//            tempList.add(s);
//            tempList.add(s + " именно");
//        }
//        System.out.println(tempList);
//        set.clear();
//        set.addAll(tempList);
//        System.out.println(set);
//        for (String s : set) {
//            System.out.println(s);
//        }
    }
}
