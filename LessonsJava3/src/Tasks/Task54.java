package Tasks;

import java.util.Random;

public class Task54 {
    public static void main(String[] args) {
        // 165. Дана строка с цифрами и буквами. Проверить, что в этой строке не более 3 букв

        String str = "a1b2c345";

        System.out.println("Проверка на не более 3-х букв в строке");
        boolean isLetter = checkCountLetters(str);
        System.out.print(isLetter);

        // 166. Дан массив размером 10. Заполнить массив случайными целыми числами от 1 до 100

        int[] arr = new int[10];

        System.out.println("\nВывод массива с рандомными числами");
        randomArr(arr);

        // 167. Дана строка. Удалите в этой строке каждый третий символ

        String word = "abcdefg";

        System.out.println("\nУдаление каждого третьего символа");
        delThirdChar(word);

        // 168. Дан массив целых чисел. Перевелите эти числа в названия месяцев

        int[] monthNum = {1, 2, 8};

        String[] monthName = getMonthNames(monthNum);

        System.out.println("\nПреобразование в строку названия месяцев");
        for (String s : monthName) {
            System.out.print(s + " ");
        }
    }
    // 1.
    public static boolean checkCountLetters(String str) {
        int letterCount = 0;

        for (int i = 0; i < str.length() && letterCount <= 3; i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }
        if (letterCount <= 3) {
            return true;
        }else {
            return false;
        }
    }
    // 2.
    public static void  randomArr(int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 101);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    // 3.
    public static void delThirdChar(String word) {
        String[] wordArr = word.split("");

        for (int i = 0; i < wordArr.length; i++) {
            if ((i + 1) % 3 == 0) continue;
            System.out.print(wordArr[i]);
        }
    }

    // 4.
    public static String[] getMonthNames(int[] num) {
        String[] monthNames = new String[num.length];

        for (int i = 0; i < num.length; i++) {
            switch (num[i]) {
                case 1:
                    monthNames[i] = "Январь";
                    break;
                case 2:
                    monthNames[i] = "Февраль";
                    break;
                case 8:
                    monthNames[i] = "Август";
                    break;
                default:
                    monthNames[i] = "Такого месяца нет";
            }
        }
        return monthNames;
    }
}
