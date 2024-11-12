package Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task67 {
    public static void main(String[] args) {
        // 212. Вывести на экран название следующего дня недели

        getNextDayOfWeek();

        // 213. Пользователь вводит дату в формате год-месяц-день. Проверьте, что ввод корректный

        String strDate = "2025-12-31";

        System.out.println("Проверка ввода пользователя даты");
        boolean date = isDate(strDate);
        System.out.println(date);

        // 214. Пользователь вводит с консоли число. Проверить, что это действительно число

        String number = "123";

        System.out.println("Проверка на ввод числа пользователем");
        boolean isNum = isNumber(number);
        System.out.println(isNum);

        // 215. Напишите программу, которая будет выводить строку "12345 54321"

        getStringAndReverseStr();

        // 216. Дан массив. Вывести в формате

        int[] array = {1, 2, 3, 4, 5, 6};

        printFormatArray(array);

        try {
            int result = 10 / 0;
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка. Деление на 0 невозможно");
        }
    }
    // 1.
    public static void getNextDayOfWeek() {
        LocalDate currentDate = LocalDate.now();

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        DayOfWeek nextDayOfWeek = dayOfWeek.plus(1);

        System.out.println("Вывод следующего дня недели");
        System.out.println(nextDayOfWeek);
    }
    // 2.
    public static boolean isDate(String dateStr) {
        try {
            LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        }catch (DateTimeParseException e) {
            return false;
        }
    }
    // 3.
    public static boolean isNumber(String input) {
        try {
            Scanner scanner = new Scanner(input);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                return true;
            }else {
                return false;
            }
        }catch (InputMismatchException e) {
            return false;
        }
    }
    // 4.
    public static void getStringAndReverseStr() {
        StringBuilder fiveNumbers = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            fiveNumbers.append(i);
        }
        StringBuilder reverseFiveNumbers = new StringBuilder();
        for (int i = 5; i >= 1; i--) {
            reverseFiveNumbers.append(i);
        }
        System.out.println(fiveNumbers + " " + reverseFiveNumbers);
    }
    // 5.
    public static void printFormatArray(int[] arr) {
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(arr[i] + "," + (i + 1 < arr.length ? arr[i + 1]:""));
        }
    }
}
