package Tasks;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Task71 {
    public static void main(String[] args) {
        // 230. Вывести в консоль остаток дней до конца месяца

        long lastDays = lastDaysOfMonth();
        System.out.println(lastDays + " дней осталось до конца месяца");

        // 231. Проверить правильноесть ввода email

        String email = "MuseIQ@yandex.ru";

        System.out.println(isValidEmail(email));

        // 232. Пользователь вводит дату. Проверить, былф ли эта дата в этом году

        LocalDate date = LocalDate.of(1989, 6, 19);

        System.out.println(checkDate(date));

        // 233. Посчитать количество дней до ближайшего дня рождения

        LocalDate birthday = LocalDate.of(1989, 6, 19);

        countDaysToBirthYears(birthday);

        // 234. Дан массив чисел. Вывести цифры этого массива

        int[] arrNums = {123, 456, 789};

        printDigitsPfArray(arrNums);
    }
    // 1.
    public  static long lastDaysOfMonth() {
        LocalDate today = LocalDate.now();

        LocalDate lastDayOfMonth = today.withDayOfMonth(today.lengthOfMonth());

        long lastDays = ChronoUnit.DAYS.between(today, lastDayOfMonth);

        return lastDays;
    }
    // 2.
    public static boolean isValidEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", email);
    }
    // 3.
    public static boolean checkDate(LocalDate date) {
        int currentYear = Year.now().getValue();

        return  date.getYear() == currentYear;
    }
    // 4.
    public static void countDaysToBirthYears(LocalDate birthday) {
        LocalDate today = LocalDate.now();

        LocalDate nextBirthDay = birthday.withYear(today.getYear());

        if (nextBirthDay.isBefore(today)) {
             nextBirthDay = nextBirthDay.plusYears(1);
        }
        Period period = Period.between(today, nextBirthDay);
        System.out.println("До ближайшего дня рождения осталось " + period.getDays() + " дней");
    }
    // 5.
    public static void printDigitsPfArray(int[] arr) {
        String numbersString = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            numbersString += String.valueOf(arr[i]);
            char dig = numbersString.charAt(i);
            count++;
        }
        int[] digits = new int[count];
        for (int i = 0; i < numbersString.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(numbersString.charAt(i)));
        }
        for (int digit : digits) {
            System.out.print(digit + ", ");
        }
    }
}
