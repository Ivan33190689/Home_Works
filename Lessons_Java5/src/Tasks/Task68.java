package Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Task68 {
    public static void main(String[] args) {
        // 217. Пользователь вводит с консоли два целых числа. Вывести массив чисел от минимального до максимального

        printArray();

        // 218. Пользователь вводит дату в формате год, месяц, день. Вывести по дате день недели

        printDayOfWeek();

        // 219. Пользователь вводит год. Проверить, является ли он високосным

        checkOnTheLeap();

        // 220. Дан массив. Поменять местами пары чисел.

        int[] arr = {1, 2, 3, 4, 5, 6};

        reverseCoupleNumbers(arr);
    }
    // 1.
    public static void printArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        }else {
            for (int i = num2; i <= num1; i++) {
                System.out.print(i + " ");
            }
        }
    }
    // 2.
    public static void printDayOfWeek() {
        LocalDate date = LocalDate.of(1989, 6, 19);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("\nВывод дня недели по дате");
        System.out.println(dayOfWeek);
    }
    // 3.
    public static void checkOnTheLeap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (Year.isLeap(year)) {
            System.out.print(year + " - високосный год");
        }else {
            System.out.println(year + " - невисокосный год");
        }
    }
    // 4.
    public static void reverseCoupleNumbers(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int right = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right];
                right+=2;
            }else {
                result[i] = arr[left];
                left+=2;
            }
        }
        printArray(result);
    }
    private static void printArray(int[] arr) {
        System.out.println("\nВывод массива");

        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }
}
