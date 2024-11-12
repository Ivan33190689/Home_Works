package Tasks;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;
import java.util.NavigableMap;
import java.util.Scanner;

public class Task66 {
    public static void main(String[] args) {
        // 208. Выведите дату. В стиле год, месяц, день

        System.out.println("Вывод даты");
         LocalDate localDateNow = printLocalDateNow();
        System.out.println(localDateNow);

        // 209. Вывести текущее название дня недели

        System.out.println("Вывод названия текущей недели");
        dayOfWeek();

        // 210. Пользователь вводит число с консоли. Вывести корень квадратный этого числа

        double sqrt = getSqrtOfNumber();
        System.out.println(sqrt);

        // 211. Дана некоторая строка со словами. Удалите из этой строки каждое второе слово

        String words = "aaa, bbb, ccc, ddd, eee";

        delSecondsWords(words);
    }
    // 1.
    public static LocalDate printLocalDateNow() {
        return LocalDate.now();
    }
    // 2.
    public static void dayOfWeek() {
        LocalDate currentLocalDate = LocalDate.now();

        DayOfWeek dayOfWeek = currentLocalDate.getDayOfWeek();

        System.out.println(dayOfWeek);
    }
    // 3.
    public static double getSqrtOfNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = sc.nextDouble();

        System.out.println("Корень числа " + number + ":");
        double result = Math.sqrt(number);

        return result;
    }
    // 4.
    public static void delSecondsWords(String str) {
        String[] strArr = str.split(" ");

        System.out.println("Вывод строки с нечётными словами");
        for (int i = 0; i < strArr.length; i+=2) {
            System.out.print(strArr[i] + " ");
        }
    }
}
