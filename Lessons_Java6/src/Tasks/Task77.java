package Tasks;

import javax.print.DocFlavor;
import javax.print.attribute.standard.PresentationDirection;
import javax.xml.stream.events.StartDocument;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Task77 {
    public static void main(String[] args) {
        // 260. Создайте метод, который принимает число, а на выходе удаляет нули этого числа

        int number = 160340;
        System.out.println("Вывод числа с удалёнными нулями");
        delZeroWithNum(number);

        // 261. Создать метод, который будет возвращать количество дней от даты, в зависимости от того, прощёл или ещё нет этот день

        getCountDays();

        // 262. Создать метод, Который принимает год и проверяет Высокосный он или нет

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        checkLeapYear(year);

        // 263. Cоздайте метод, который будет возвращать количество днеё до конца месяца

        daysToEndMonth();

        // 264. Создать метод, который выводит вчерашний, сегодняшний и завтрашний день в массиве в формате ["пт", "cб", "вс"]

        printYesterdayTodayTomorrow();
    }
    // 1.
    public static void delZeroWithNum(int num) {
        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length(); i++) {
            char c = strNum.charAt(i);
            if (c != '0') {
                System.out.print(c);
            }
        }
    }
    // 2.
    public static void getCountDays() {
        LocalDate date = LocalDate.of(2024, 4, 16);

        LocalDate today = LocalDate.now();

        Period period = Period.between(date, today);

        int days = period.getDays();

         if (days > 0) {
             System.out.println("\n Прощло " + days + " дней");
         } else {
             System.out.println("\n Будет " + Math.abs(days) + " дней");
         }
    }
    // 3.
    public static void checkLeapYear(int year) {
        System.out.println("Проверка года не високосный год");
        if (Year.isLeap(year)) {
            System.out.println("\n" + year + " Високосный год");
        } else {
            System.out.println("\n" + year + " Невисокосный год");
        }
    }
    // 4.
    public static void daysToEndMonth() {
        LocalDate currentDate = LocalDate.now();

        LocalDate lengthMonthOfDate = currentDate.withDayOfMonth(currentDate.lengthOfMonth());

        Period period = Period.between(currentDate, lengthMonthOfDate);

        System.out.println("Количество дней до конца месяца");
        int daysToMonthEnd = period.getDays();
        System.out.println(daysToMonthEnd + " дней");
    }
    // 5.
    public static String[] printYesterdayTodayTomorrow() {
        LocalDate today = LocalDate.now();

        LocalDate yesterday = today.minusDays(1);

        LocalDate tomorrow = today.plusDays(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE");

        String yesterdayStr = yesterday.format(formatter);

        String todayStr = today.format(formatter);

        String tomorrowStr = tomorrow.format(formatter);

        String[] dates = {yesterdayStr, todayStr, tomorrowStr};

        printArray(dates);
        return dates;
    }
    private static void  printArray(String[] dates) {
        System.out.println(Arrays.toString(dates));
    }
}
