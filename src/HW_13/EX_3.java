package HW_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи

public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            map.put(city, family);
        }
        String city = reader.readLine();
        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }
 */
public class EX_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> map = new HashMap<>();
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            if (num <= 0) {
                break;
            }
            String family = reader.readLine();
            map.put(num, family);
        }
        int num = Integer.parseInt(reader.readLine());
        if (map.containsKey(num)) {
            String familyName = map.get(num);
            System.out.println(familyName);
        }
    }
}
