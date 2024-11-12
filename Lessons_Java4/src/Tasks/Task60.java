package Tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        // 187. Попросите у пользователя ввести число в консоль в промежутке от 1 до 10.
        // Если пользователь ввёл что-то другое, попросите его ввести число ещё раз

        printNumber();

        // 188. Сформировать массив

        int[][] arr2D = new int[5][3];

        printArr2D(arr2D);

        // 189. Дана строка. Удалить дублирующие символы

        String str = "abcdefabc";

        System.out.println("Вывод строки без дублирующих символов");
        String result = delDoubleChars(str);
        System.out.println(result);

        // 190. Дана строка. Перевести в верхний регистр все нечётные символы

        String word = "abcdef";

        System.out.println("Вывод строки с заглавными буквами на нечётных индексах");
        String res = printOddCharsInCapitalise(word);
        System.out.println(res);
    }
    // 1.
    public static void printNumber() {
        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            System.out.print("Введите число от 1 до 10: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите число ещё раз: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        System.out.print("Введено число " + num);
    }
    // 2.
    public static void printArr2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        System.out.println("\nВывод массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 3.
    public static String delDoubleChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return  result;
    }
    public static String printOddCharsInCapitalise(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((i + 1) % 2 != 0) {
                stringBuilder.append(Character.toUpperCase(c));
            }else {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        return stringBuilder.toString();
    }
}
