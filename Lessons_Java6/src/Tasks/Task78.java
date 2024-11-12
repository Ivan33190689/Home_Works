package Tasks;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.function.IntFunction;

public class Task78 {
    public static void main(String[] args) {
        // 265. Создать массив, который будет принимать параметром массив и выводить новый массив, не имеющий дубликатов

        int[] array = {1, 2, 3, 3, 4, 5, 5, 6, 1};

        newArrNotDouble(array);

        // 266. Создать массив, который будет принимать параметром массив и выводить элементы которые не дубдируются друг за другом

        int[] numbers = {1, 2, 3, 3, 4, 5, 5, 6};

        getArrayNotDouble(numbers);

        // 267. Создать метод, который первым параметром будет принимать число, а второй параметр будет показывать количество цифр этого числа

        int number = 123456789;
        int count = 6;

        String result = printCountDigits(number, count);
        System.out.println(result);

        // 268. Создать метод, который будет проверять простое число или не простое в параметрах метода

        int num = 23;

        checkOnTheSympleNumber(num);

        // 269. Создать метод, принимающий параметром массив целых чисел, который будет возвращать массив с максимальным и минимальным значением

        int[] arr = {12, 61, 24, 7, 95, 10};

        printMaxAndMinElements(arr);
    }
    // 1.
    public static void newArrNotDouble(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : array) {
            uniqueSet.add(num);
        }
        int[] result = new int[uniqueSet.size()];
        int index = 0;

        for (int num : uniqueSet) {
            result[index++] = num;
        }
        printArray(result);
    }
    private static void printArray(int[] array) {
        System.out.println("Вывод массива с уникальными элементами");
        System.out.println(Arrays.toString(array));
    }
    // 2.
    public static int[] getArrayNotDouble(int[] array) {
        List<Integer> uniqueSet = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                uniqueSet.add(array[i]);
            }
        }
        int[] result = new int[uniqueSet.size()];
        int index = 0;

        for (int num : uniqueSet) {
            result[index++] = num;
        }
        printNewArray(result);
        return result;
    }
    private static void printNewArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    // 3.
    public static String printCountDigits(int number, int count) {
        String numberStr = String.valueOf(number);

        if (count > numberStr.length()) {
            return "Число больше количества цифр в числе";
        }
        return numberStr.substring(0, count);
    }
    // 4.
    public static void checkOnTheSympleNumber(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " простое число");
        } else {
            System.out.println(number + " не простое число");
        }
    }
    // 5.
    public static int[] printMaxAndMinElements(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int[] result = {max, min};
        printMaxMin(result);

        return result;
    }
    private static void printMaxMin(int[] array) {
        int[] arr = {12, 61, 24, 7, 95, 10};

        System.out.print("Вывод максимального и минимального элементов массива ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
    }
}
