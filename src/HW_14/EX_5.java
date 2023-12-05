package HW_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко
 */
public class EX_5 {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            input.add(sc.nextLine());
        }

        List<Integer> nums = new ArrayList<>();
        List<String> words = new ArrayList<>();
        for (String word : input) {
            if (isNumber(word)) {
                nums.add(Integer.valueOf(word));
            } else {
                words.add(word);
            }
        }
        Collections.sort(nums);
        Collections.reverse(nums);
        Collections.sort(words);

        int wordI = 0;
        int numI = 0;

        for (String word : input) {
            if (isNumber(word)) {
                result.add(nums.get(numI).toString());
                numI++;
            } else {
                result.add(words.get(wordI));
                wordI++;
            }
        }
        result.forEach(System.out::println);

    }

    private static boolean isNumber(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isDigit(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
