package Tasks;

import java.util.Arrays;

public class Task63 {
    public static void main(String[] args) {
        // 196. Дан массив. Отсортировать его

        int[][] arr2D = {
                {2, 1, 4, 3, 5},
                {3, 5, 2, 4, 1},
                {4, 3, 1, 5, 2},
        };

        arraySort(arr2D);

        // 197. Дан массивю Слить элементы в пары

        int[] array = {1, 2, 3, 4, 5, 6};

        getPairsElem(array);

        // 198. Вывести пирамидку

        int[][] piramid = new int[9][3];

        getPiramid(piramid);
    }
    // 1.
    public static void arraySort(int[][] arr) {
        System.out.println("Вывод отсортированного массива");
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 2.
    public static void getPairsElem(int[] arr) {
        int[] pair = new int[arr.length / 2];

        for (int i = 0; i < arr.length; i+=2) {
            pair[i / 2] = arr[i] * 10 + arr[i + 1];
        }
        System.out.println("Вывод пар элементов");
        for (int num : pair) {
            System.out.print(num + " ");
        }
    }
    // 3.
    public static void getPiramid(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
        System.out.println("\nВывод пирамиды");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
