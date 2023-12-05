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
//        Collections.sort(list);
        quickSort(list, 0, list.size() - 1);
        System.out.println(list);
        System.out.println(list.get(9) + "\n" + list.get(10));
    }

    //Алгоритм быстрой сортировки (Quick Sort или сортировка Хоара)
    public static void quickSort(List<Integer> sortArr, int low, int high) {
        if (sortArr.isEmpty() || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = sortArr.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (sortArr.get(i) < border) i++;
            while (sortArr.get(j) > border) j--;
            if (i <= j) {
                int swap = sortArr.get(i);
                sortArr.set(i, sortArr.get(j));
                sortArr.set(j, swap);
                i++;
                j--;
            }
        }
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
}
