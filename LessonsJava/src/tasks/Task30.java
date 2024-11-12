package tasks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Task30 {
    public static void main(String[] args) {
        // 64. Дан массив Целых чисел. Преобразовать его в массив строк.

        int[] arrayNums = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        String[] arrayStr = new String[arrayNums.length];

        for (int i = 0; i < arrayNums.length; i++) {
            arrayStr[i] = String.valueOf(arrayNums[i]);
            System.out.print(arrayStr[i] + "");
        }
        // 65. Дан массив с датой. Нужно развернуть дату.

        String[] strArray = {"2025", "12", "31"};

        String day = strArray[2].trim();
        String month = strArray[1].trim();
        String year = strArray[0].trim();

        System.out.printf("\n" + "%s-%s-%s", day, month, year);

        // 66. Дан массив строк. Преобразовать в массив символов.

        String[] strArr = {"ab", "cd", "ef"};

        char[] charArray = new char[strArr.length * strArr[0].length()];
        int index = 0;

        for (String str : strArr) {
            for (int i = 0; i < str.length(); i++) {
                charArray[index++] = str.charAt(i);
            }
        }
        System.out.println("\nВывод массива символов");
        for (char c : charArray) {
            System.out.print(c + ", ");
        }
    }
}
