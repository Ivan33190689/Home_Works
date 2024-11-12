package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task44 {
    public static void main(String[] args) {
        // 120. Дана строка. Вывести позиции всех нулей в этой строке

        String str = "023m0df0dfe0";
        List<Integer> indexesOfZero = new ArrayList<>();

        System.out.println("Вывод индексов нулей в строке");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                indexesOfZero.add(i);
            }
        }
        System.out.print(indexesOfZero + " ");

        // 121. Дан массив целых чисел. Получить результат в виде деления суммы первой половины массива на вторую сумму половины

        int[] arr = {1, 2, 3, 4, 5, 6};

        int left = arr.length / 2;
        int right = arr.length - left;

        int sum = 0;
        int sum1 = 0;

        System.out.println("1. Вывод массива");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n2.Сумма  элементов массива");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println("\n3. Сумма первой половины массива");
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        System.out.println(sum1);

        System.out.println("\n4. Сумма второй половины массива");

        int sum2 = sum - sum1;
        System.out.println(sum2);

        System.out.println("\n5. Деление первой половины массива на вторую");
        double del = (double) sum1 / sum2;
        System.out.println(del);

        // 122. Дан массив строк. Преобразовать его в мвссив символов.

        String[] words = {"ab", "cd", "ef"};
        char[] letters = new char[words.length * words[0].length()];
        int index = 0;

        for (String letter : words) {
            for (int i = 0; i < letter.length(); i++) {
                letters[index++] = letter.charAt(i);
            }
        }
        System.out.println("\nВывод массива символов");
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        // 123 . Даны два массива. Перебрать их в одном цикле

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int i = 0;

        System.out.println("\nВывод двух массивов одним перебором");
        for (int element1 : arr1) {
            System.out.print(element1 + " : ");
            System.out.print(arr2[i] + " ");
            i++;
        }
        // 124. Дано число. Перевести его в двоичную систему исчисления

        int number = 12;

        String binary = Integer.toBinaryString(number);

        System.out.println("\nЧисло " + number + " в двоичной системе исчисления" + " = " + binary);
    }
}