package tasks;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.Arrays;

public class Task29 {
    public static void main(String[] args) {
        // 61. Дан массив с целыми числами. Вывести массив, в котором только чётные элементы

        int[] arrayNums = {14, 35, 84, 17, 335, 37, 85, 360};

        System.out.println("Вывод массива с чётными числами");
        for (int i = 0; i < arrayNums.length; i++) {
            if (arrayNums[i] % 2 == 0) {
                System.out.print(arrayNums[i] + " ");
            }
        }
        // 62. Дан массив с целыми числами.
        // Выведите элементы этого массива до первого 0

        int[] array = {1, 2, 3, 0, 4, 5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) break;
            System.out.println(array[i] + " ");
        }
        // 63. Дан массив целых чисел. Найти суииу квадратов элементов этого массива

        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int sum2 = Arrays.stream(arr).map(x -> x * x).sum();
        System.out.println(sum2); // Вариант без цикла

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i];
        }
        System.out.println("Сумма квадратов элементов массива = " + sum);
    }
}
