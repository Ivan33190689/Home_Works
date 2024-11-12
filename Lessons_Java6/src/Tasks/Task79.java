package Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task79 {
    public static void main(String[] args) {
        // 270. Создаёте метод, который будет прининмать параметром число, а возвращать количество его делителей

        int number = 265;

        System.out.println("Количество делителей числа " + number);
        int countDel = printCountDelOfNumber(number);
        System.out.println(countDel);

        // 271. Создать метод, который будет принимать число и удалять из него чётные цифры

        int num = 142386;

        System.out.println("Вывод числа " + num + " без чётных цифр");
        delEvenDigitsOfNumber(num);

        // 272. Создать массив, который будет возвращать массив с рандомными числами с заданным промежутком

        randomArray();
    }
    // 1.
    public static int printCountDelOfNumber(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return  count;
    }
    // 2.
    public static void delEvenDigitsOfNumber(int num) {
        String number = String.valueOf(num);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) % 2 != 0) {
                System.out.print(number.charAt(i));
            }
        }
    }
    // 3.
    public static int[] randomArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите размер массива: ");
        int size = scanner.nextInt();

        System.out.print("Введите минимальное значение массива: ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальное значение массива: ");
        int max = scanner.nextInt();

        int[] array = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(min, max);
        }
        printArray(array);
        return array;
    }
    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
