package HW_10;

import java.util.ArrayList;
import java.util.List;

//1
// 1. Создай список строк.
// 2. Добавь в него 5 различных строк.
// 3. Выведи его размер на экран.
//  4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
public class EX_1 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Привет");
        listString.add("Как");
        listString.add("Дела");
        listString.add("Ура");
        listString.add("Спасибо");
        System.out.println("Размер listString = " + listString.size());
        for (String str : listString) {
            System.out.println(str);
        }
    }
}
