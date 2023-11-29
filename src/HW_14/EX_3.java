package HW_14;

import java.util.*;

/*
Введи с клавиатуры 30 чисел. Выведи 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число - 1-е минимальное.
Следующее минимальное после него - 2-е минимальное.

Пример:
1 6 5 7 1 15 63 88
Первое минимальное - 1
Второе минимальное - 1
Третье минимальное - 5
Четвертое минимальное - 6
 */
public class EX_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        Collections.sort(list);
//        list.sort(Comparator.comparingInt(a -> a));
        System.out.println(list);
        System.out.println(list.get(9) + "\n" + list.get(10));
    }
}
