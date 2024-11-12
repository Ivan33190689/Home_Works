package Tasks;

import java.util.Arrays;

public class Task36 {
    public static void main(String[] args) {

        // 84. Дан массив строк. Вывести только те строки, которые начинаются на http://

        String[] arrayStr = {"java", "phayton", "http://www.java.com", "C#", "http://www.playstation.com", "http://www.super.com", "end"};

        System.out.println("Вывод строк, начинающихся с http://");
        for (String str : arrayStr) {
            if (str.startsWith("http://")) {
                System.out.print(str + " ");
            }
        }
        // 85. Дана строка. Выведите первый 0 этой строки

        String strNums = "12304506";

        for (int i = 0; i < strNums.length(); i++) {
            if (strNums.charAt(i) == '0') {
                System.out.println("\nПервый 0 на позиции " + i);
                break;
            }
        }

        // 86. Дана строка. Получить последние три символа этой строки

        String str = "abcdef";

        char[] charArray = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        sb.append(charArray[charArray.length - 3]).append(charArray[charArray.length - 2]).append(charArray[charArray.length - 1]);

        System.out.println("Вывод последних 3 символов");
        System.out.println(sb);

        // 87. Дан массив. Получить следующий срез
        // {3, 4, 5};

        int[] arrayNums = {1, 2, 3, 4, 5, 6};

        int[] slice = Arrays.copyOfRange(arrayNums, 2, 5);

        System.out.println("Вывод среза массива");
        for (int nums : slice) System.out.print(nums + " ");

        // 88. Дана строка. Получить массив слов

        String letters = "abc def ihj";
        String[] strArray = letters.split(" ");

        System.out.println("\nВывод массива строк");
        for (String word : strArray) {
            System.out.print(word + " ");
        }
    }
}
