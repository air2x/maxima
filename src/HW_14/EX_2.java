package HW_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
 */
public class EX_2 {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите пару число и строку в формате \"1 Мама\"");
            String str = sc.nextLine();
            if (str.isEmpty()) {
                break;
            }
            map.put(str.split(" ")[1], Integer.parseInt(str.split(" ")[0]));
        }
        map.forEach((k, v) -> System.out.println(v + " " + k));
    }
}
