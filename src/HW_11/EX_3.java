package HW_11;

import java.util.ArrayList;
import java.util.List;

//1.Создай список слов, заполни его самостоятельно.
//        2. Метод fix должен:
//        2.1. удалять из списка строк все слова, содержащие букву "р"
//        2.2. удваивать все слова содержащие букву "л".
//        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//        2.4. с другими словами ничего не делать.
//
//public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("роза");
//        strings.add("лоза");
//        strings.add("лира");
//        strings = fix(strings);
//
//        for (String string : strings) {
//        System.out.println(string);
//        }
//        }
//
//public static ArrayList<String> fix(ArrayList<String> strings) {
//        //напишите тут ваш код
//        return null;
//        }
public class EX_3 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("стул");
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("окно");
        strings.add("диван");
        System.out.println(strings);
        strings = fix(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> tempList = new ArrayList<>();
        for (String s : strings) {
            if (s.contains("л") && s.contains("р")) {
                tempList.add(s);
                continue;
            } else if (s.contains("л")) {
                tempList.add(s);
                tempList.add(s);
                continue;
            } else if (s.contains("р")) {
                continue;
            }
            tempList.add(s);
        }
        return tempList;
    }
}
