package Tasks;

import java.awt.geom.AffineTransform;

public class Task62 {
    public static void main(String[] args) {
        // 194. Выведите в консоль все числа от 10 до 1000, сумма первой и второй цифры которых равна пяти

        System.out.println("Вывод чисел, сумма двух первых цифр равна 5");
        for (int i = 10; i <= 1000; i++) {
            if (getSumFirstTwoDigits(i) == 5) {
                System.out.print(i + " ");
            }
        }

        // 195. Дан массив. Слить его в одномерный массив

        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        getArray(array2D);
    }
    // 1.
    private static int getSumFirstTwoDigits(int number) {
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;

        return firstDigit + secondDigit;
    }
    // 2.
    public static void getArray(int[][] arr2D) {
        int count = arr2D.length * arr2D[0].length;
        int[] array = new int[count];
        int index = 0;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                array[index++] = arr2D[i][j];
            }
        }
        System.out.println("\nВывод массива");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
