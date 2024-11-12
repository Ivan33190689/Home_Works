package Tasks;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.awt.desktop.SystemEventListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Task69 {
    public static void main(String[] args) {
        // 221. Пользователь вводит число с консоли. Преобразовать число в факториал

        printFactorial();

        // 222. Пользователь вводит дату в формате: год, месяц, день. Проверить корректно ли он ввёл дату

        String validDate = "1989-06-19";

        String invalidDate = "2023-02-30";

        System.out.println(checkDate(validDate));
        System.out.println(checkDate(invalidDate));

        // 223. Определить сколько дней осталось до Нового Года

        isDaysToNewYear();

        // 224. Дана строка, содержащая время. Проверить, корректно ли оно введено

        String time = "12:30:00";

        System.out.println("Проверка на корректное написание времени");
        System.out.println(cbeckOfTheTime(time));

        // 225. Дана строка. Удалить все подстроки, в которых символов больше 3

        String str = "1, 22, 333, 4444, 22, 5555, 1";

        printNumsToThreeSymbols(str);
    }
    // 1.
    public static void printFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

       int result = 1;

       for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(result + " - факториал числа: " + num);
    }
    // 2.
    public static boolean checkDate(String strDate) {
        try {
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    // 3.
    public static void isDaysToNewYear() {
        LocalDate today = LocalDate.now();

        LocalDate newYear = LocalDate.of(today.getYear() + 1, 1, 1);

        long daysUntilNewYear = today.until(newYear, ChronoUnit.DAYS);

        System.out.println(daysUntilNewYear + " дней осталось до Нового года");
    }
    public static boolean cbeckOfTheTime(String time) {
        try {
            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

            LocalTime.parse(time, timeFormat);
            return true;
        }catch (DateTimeParseException e) {
            return false;
        }
    }
    // 5.
    public static void printNumsToThreeSymbols(String str) {
        String[] strArr = str.split(" ");

        System.out.println("Вывод подстрок, в которых не больше 3 символов:");
        for (String num : strArr) {
            if (num.length() <= 4) {
                System.out.print(num + " ");
            }
        }
    }
}
