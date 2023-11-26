package HW_13;

import java.util.HashMap;
import java.util.Map;

/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
 */
public class EX_1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Иванов", "Петр");
        map.put("Пушкин", "Александр");
        map.put("Есенин", "Сергей");
        map.put("Толстой", "Лев");
        map.put("Толстой", "Алексей");
        map.put("Березкин", "Василий");
        map.put("Котов", "Антон");
        map.put("Печкина", "Людмила");
        map.forEach((kay, value) -> System.out.println(kay + " - " + value));
    }
}
