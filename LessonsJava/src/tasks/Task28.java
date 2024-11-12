package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task28 {
    public static void main(String[] args) {
        // 58. Дан массив с целыми числами. Вывести массив в обратном порядке

        int[] arrayOfNums = {1, 2, 3, 4, 5};

        System.out.println("Развёрнутый массив");
        for (int i = arrayOfNums.length - 1; i >= 0; i--) {
            System.out.print(arrayOfNums[i] + " ");
        }
        // 59. Дан массив строк с числами. Преобразуйте массив строк в массив целых чисел

        String[] strArray = {"123", "456", "789"};
        int[] numArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            numArray[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println("\nПреобразованный массив строк в массив чисел");
        System.out.println(Arrays.toString(numArray));

        // 60. Дан массив с целыми числами.
        // Найдите сумму элементов, которые больше 0 и меньше 10

        int[] arr = {-1, 2, -3, 4, 5, 11};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < 10) sum += arr[i];
        }
        System.out.println(sum + " сумма чисел массива, которые больше 0 и меньше 10");
    }
}
