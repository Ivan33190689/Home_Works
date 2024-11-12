package Tasks;

import javax.sql.rowset.FilteredRowSet;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        // 248. Пользователь вводит две даты в формате год, месяц, день. Определить сколько дней между этими датами

        LocalDate date1 = LocalDate.of(2020, 10, 15);
        LocalDate date2 = LocalDate.of(2022, 6, 10);

        int days = calculateDays(date1, date2);

        System.out.println(days);

        // 249. Заполнить массив рандомными числами в промежутке от 1 до 100

        getRandomArray();

        // 250. Выведите даты текущего месяца в формате год, месяц, день. Отметить будни и выходные, а также текущий день

        printCurrentMonth();

        // 251. Написать программу, которая выведет строку "12 34 56 78"

        printString();

        // 252. Вывести в консоль строку "1+2-3+4-5+6-7+8"

        getString();

        // 253. Дан массив. Проверить, что в нём есть два одинековых элемента подряд

        int[] array = {1, 2, 3, 3, 4, 5};

        boolean checkArray = checkArrayOnTheDoubleElement(array);
        if (checkArray) {
            System.out.println("В массиве содержатся два рядом стоящих одинаковых элемента");
        } else {
            System.out.println("В массиве нет двух одинаковых рядом стоящих элементов");
        }
    }
    // 1.
    public static int calculateDays(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);

        int days = Math.abs(period.getDays());

        return days;
    }
    // 2.
    public static int[] getRandomArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1, 101);
        }
        printArray(array);
        return array;
    }
    private static void printArray(int[] array) {
        System.out.println("Вывод массива с рандомными значениями");

        System.out.print(Arrays.toString(array));
    }
    // 3.
    public static void printCurrentMonth() {
        LocalDate today = LocalDate.now();

        LocalDate firstDay = today.withDayOfMonth(1);

        int lastDayOfMonth = today.getMonth().length(today.isLeapYear());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("\n Вывод текущего месяца");
        for (int i = 1; i <= lastDayOfMonth; i++) {
            LocalDate date = firstDay.plusDays(i - 1);

            if (date.equals(today)) {
                System.out.println(date.format(formatter) + " Текущий день");
            } else if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println(date.format(formatter) + " Выходной день");
            } else {
                System.out.println(date.format(formatter) + " Рабочий день");
            }
        }
    }
    // 4.
    public static void  printString() {
        int[] numbers = {12, 34, 56, 78};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(numbers[i]);
        }
        String result = sb.toString();
        System.out.println(result);
    }
    // 5.
    public static void getString() {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                sb.append("+").append(digits[i]);
            }else {
                sb.append("-").append(digits[i]);
            }
        }
        System.out.println(sb.substring(1).toString());
    }
    // 6.
    public static boolean checkArrayOnTheDoubleElement(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
