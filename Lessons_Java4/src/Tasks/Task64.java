package Tasks;

import java.util.Arrays;

public class Task64 {
    public static void main(String[] args) {
        // 199. Вывести пирамидку

        int row = 5;

        getPiramid(row);

        // 200. Дан массив. Заменить в нём символ 1 на 0

        String[][] strArray2D = {
                {"123"},
                {"213"},
                {"321"},
        };

        zeroInNumber(strArray2D);

        // 201. Дан массив. Увеличить его вдвое

        int[] array = {1, 2, 3, 4, 5};

        getDublicatedNumbersArray(array);

        // 202. Дан массив строк. Вывести каждый элемент строки в новой линии

        String[] text = {
                "text1",
                "text2",
                "text3",
                "text4",
                "text5",
        };

        printNewLineArray(text);
    }
    // 1.
    public static void getPiramid(int row) {
        for (int i = 0; i <= row * 2; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
    // 2.
    public static void zeroInNumber(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j].replace("1", "0");
            }
        }
        System.out.println("Вывод массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 3.
    public static void getDublicatedNumbersArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", " + arr[i] + ", ");
        }
    }
    // 4.
    public static void printNewLineArray(String[] arr) {
        System.out.println("\nВывод каждого элемента с новой линии");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
