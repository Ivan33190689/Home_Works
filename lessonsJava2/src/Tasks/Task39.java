package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Task39 {
    public static void main(String[] args) {
        // 97. Дан текст. Записать все слова в массив, начинающиеся на букву "a"

        String text = "java - абсолютно типизированный язык. Он был официально анонсирован в 1995 году. Он и сейчас очень прогрессивный, хоть и считается архаичным языком";

        String[] words = text.split(" ");

        System.out.println("Вывод слов, начинающихся на букву 'а'");
        for (String word : words) {
            if (word.toLowerCase().startsWith("а")) {
                System.out.print(word + " ");
            }
        }
        // 98. Дан массив с числами. Проверить, все ли числа в массиве положительные

        int[] nums = {1, 2, 3, 4, 5, 6};

        isPositiveNumbersOfArray(nums);

        // 99. Дана строка. Найти позицию последнего нуля

        String strNumbers = "123045067";

        int lastZeroIndex = -1;

        for (int i = 0; i < strNumbers.length(); i++) {
            if (strNumbers.charAt(i) == '0') {
                lastZeroIndex = i;
            }
        }
        if (lastZeroIndex != -1) {
            System.out.println(lastZeroIndex + " позиция последнего ноля в строке");
        }else {
            System.out.println("Нуля в строке нет");
        }
        // 100. Даны два массива. Вывести в консоль общие элементы массивов

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 7, 8, 9};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1){
            set1.add(num);
        }
        System.out.println("Вывод общих элементов массивов");
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        System.out.print(set2 + " ");

        // 101. Дана строка. Посчитать количество слов в строке

        String textStr = "abc def ihj";

        String[] strArr = textStr.split(" ");
        int count = 0;

        System.out.println("\nКоличество строк");
        for (int i = 0; i < strArr.length; i++) {
            count++;
        }
        System.out.println(count);
    }
    public static void isPositiveNumbersOfArray(int[] array) {
        boolean isPositiveDigits = true;

        for (int element : array) {
            if (element <= 0) {
                isPositiveDigits = false;
            }
        }
        if (isPositiveDigits) {
            System.out.println("\nВсе числа в массиве положительные");
        }else {
            System.out.println("\nНе все числа в массиве положительные, либо все отрицательные");
        }
    }
}
