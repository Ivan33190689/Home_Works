package Tasks;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        // 203. Вывести пирамидку

        getPiramid();

        // 204. Дан массив. Перевернуть каждую цифру в этом массиве

        int[] array = {123, 456, 789};

        reverseNumsInArr(array);

        // 205. Дан массив. Заменить в нём 3 на 0, кроме первой цифры

        int[] arr = {123, 333, 133};

        replaceThreeOnZero(arr);

        // 206. Пользователь вводит число в консоль. Нужно создать таблицу умножения с этим числом

        multiplicationTable();

        // 207. Дана строка. Вывести массив строк, чтобы каждая строка начиналась с новой линии

        String text = "text1, " +
                      "text2, " +
                      "text3, " +
                      "text4, " +
                      "text5,";

        stringArray(text);
    }
    // 1.
    public static void getPiramid() {
        System.out.println("Вывод пирамиды");
        for (int i = 1; i <= 10; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    // 2.
    public static void reverseNumsInArr(int[] arr) {
        int[] reverseNumArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String strNums = String.valueOf(arr[i]);

            StringBuilder sb = new StringBuilder(strNums);

            reverseNumArray[i] = Integer.parseInt(sb.reverse().toString());
        }
        printArray(reverseNumArray);
    }
    private static void printArray(int[] arr) {
        System.out.println("Вывод перевёрнутых элементов массива");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
    // 3.
    public static void replaceThreeOnZero(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String str = String.valueOf(arr[i]);

            result[i] = Integer.parseInt(str.replaceAll("(?!^)3", "0"));
        }
        printArr(result);
    }
    private static void printArr(int[] arr) {
        System.out.println("\nВывод массива с заменой 3 на 0");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    // 4.
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nВведите число: ");
        int number = sc.nextInt();

        System.out.println("Вывод таблицы умножения с числом " + number + ":");
        for (int i = 1; i < 10; i++) {
            int result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
    // 5.
    public static void stringArray(String str) {
        String[] newStr = str.split(" ");
        String[] strArr = new String[newStr.length];

        for (int i = 0; i < newStr.length; i++) {
            strArr[i] = newStr[i];
        }
        printStrArray(strArr);
    }
    private static void printStrArray(String[] arr) {
        System.out.println("Вывод массива строк с новой линии");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
