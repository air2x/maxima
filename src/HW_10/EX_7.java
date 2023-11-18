package HW_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//7
//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//   Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//   Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//   Порядок объявления списков очень важен.
//  1.1 Создай метод printList
//      2. Метод printList должен выводить на экран все элементы списка с новой строки.
//      3. Используя метод printList выведи эти три списка на экран.
//         Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
public class EX_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listInt = new ArrayList<>();
        List<Integer> listInt2 = new ArrayList<>();
        List<Integer> listInt3 = new ArrayList<>();
        List<Integer> listIntOthers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            System.out.println("Введите число");
            int num = sc.nextInt();
            listInt.add(num);
            if (num % 2 == 0) {
                listInt2.add(num);
            }
            if (num % 3 == 0) {
                listInt3.add(num);
            }
            if (num % 2 != 0 && num % 3 != 0) {
                listIntOthers.add(num);
            }
        }
        printList(listInt3);
        printList(listInt2);
        printList(listIntOthers);
    }

    // Вывод сделал в одну строку иначе не читабельно.
    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + ", ");
        }
        System.out.println("\n---------------------------");
    }
}

