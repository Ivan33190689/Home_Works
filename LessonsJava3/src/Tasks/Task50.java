package Tasks;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Task50 {
    public static void main(String[] args) {
        // 146. Выведите все числа от 1 до 1000, сумма цифр которых равна 13

        System.out.println("Вывод чисел, сумма цифр которых равна 13");
        sumDigitsThirteen();

        // 147. Даны значения пикселей в виде целых чисел. Найти сумму этих пикселей

        String px1 = "12px";
        String px2 = "15px";

        System.out.println("\nВывод суммы двух строк");
        String sumPx = sumOfPixels(px1, px2);
        System.out.print(sumPx);

        // 148. Дан массив целых чисел. В новом массиве вывести каждый элемент первого массива дважды

        int[] array = {1, 2, 3};

        System.out.println("\nВывод повторяющихся дважды элементов");
        printDoubleElementsOfArray(array);

        // 149. Дан массив целых чисел. Выведите в новом массиве элементы за исключением N начальных элементов

        int[] arr = {1, 2, 3, 4};

        printNewArray(arr);
    }
    // 1.
    public static void sumDigitsThirteen() {
        for (int i = 1; i <= 1000; i++) {
            if (sumOfDigits(i) == 13) {
                System.out.print(i + " ");
            }
        }
    }
    private static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
    // 2.
    public static String sumOfPixels(String px1, String px2) {
        String strPx1 = px1.replaceAll("[^0-9]", "");
        String strPx2 = px2.replaceAll("[^0-9]", "");

        int pixel1 = Integer.parseInt(strPx1);
        int pixel2 = Integer.parseInt(strPx2);

        int sum = pixel1 + pixel2;

        StringBuilder sumPx = new StringBuilder();
        sumPx.append(sum).append("px");

        return sumPx.toString();
    }
    // 3.
    public static void printDoubleElementsOfArray(int[] originArray) {
        int[] newArray = new int[originArray.length * 2];

        for (int i = 0; i < originArray.length; i++) {
            newArray[i * 2] = originArray[i];

            newArray[i * 2 + 1] = originArray[i];
        }
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
    // 4.
    public static void printNewArray(int[] arr) {
        int N = 2;
        int[] newArray = new int[arr.length - N];
        int index = 0;

        for (int i = 2; i < arr.length; i++) {
            newArray[index++] = arr[i];
        }
        System.out.println("\nВывод массива без первых N элементов");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
