package tasks;

import java.util.EnumMap;
import java.util.Enumeration;

public class Task25 {
    public static void main(String[] args) {
        // 49. Дан массив с целыми числами. Найти сумму чисел этого массива

        int[] arr = {1, 2, 3, 4, 5, 7, 10};
        int summa = 0;

        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        System.out.println(summa + " - сумма элементов массива");

        // 50. Дано некоторое целое число. Выведите в консоль все его цифры с конца

        System.out.println("Исходное число");
        int number = 12345;
        System.out.println(number);
        int digit = 0;

        System.out.println("Вывод числа в обратном порядке");
        while (number > 0) {
            digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        // 51. Дан массив целых чисел. Найти сумму квадратов этого массива.

        int[] array = {1, 2, 3, 4, 5};
        int s = 0;

        for (int i = 0; i < array.length; i++) {
            s += array[i] * array[i];
        }
        System.out.println("\n" + s + " - сумма элементов массива");
    }
}
