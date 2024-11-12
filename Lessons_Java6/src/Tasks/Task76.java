package Tasks;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Task76 {
    public static void main(String[] args) {
        // 254. Вывод текущего дня недели

        DayOfWeek currentDayOfWeek = printDayOfWeek();
        System.out.println(currentDayOfWeek);

        // 255. Создать метод, принимающий дату и возвращающий день недели

        LocalDate date = LocalDate.of(1989, 6, 19);

        DayOfWeek dayOfWeek = getDayOfWeek(date);
        System.out.println(dayOfWeek);

        // 256. Создать метод, принимающий секунды, а возвращающий количество суток по секундам

        long seconds = 86400;

        System.out.println("Вывод количества дней по секундам");
        long days = getCountDays(seconds);
        System.out.println(days + " дней");

        // 257. Создать метод, который будет принимать два параметра число и строку. Нужно обрезать строку до длины первого рараметра

        int number = 12345;
        String word = "число";

        detString(number, word);

        // 258. Создать метод, который бужет принимать параметром дату, а выводить знак зодиака этой даты

        LocalDate date1 = LocalDate.of(1990, 12, 3);

        String zodiacSigns = printZodiacSigns(date1);
        System.out.println(zodiacSigns);

        // 259. Создать метод, который будет принимать параметром число, а выводить сумму делителей этого числа

        int num = 50;

        int sumDelNumber = sumDelOfNumber(num);
        System.out.println(sumDelNumber);
    }
    // 1.
    public static DayOfWeek printDayOfWeek() {
        LocalDate today = LocalDate.now();

        System.out.println("Вывод текущего дня недели");

        return today.getDayOfWeek();
    }
    // 2.
    public static DayOfWeek getDayOfWeek(LocalDate date) {
        System.out.println("Вывод дня недели по введённой дате");

        return date.getDayOfWeek();
    }
    // 3.
    public static long getCountDays(long seconds) {
       return TimeUnit.SECONDS.toDays(seconds);
    }
    // 4.
    public static  void detString(int num, String str) {
        System.out.println("Вывод размера первого параметра метода");
        String number = String.valueOf(num);

        System.out.println(number.length());
    }
    // 5.
    public static String printZodiacSigns(LocalDate date) {
        int month = date.getMonthValue();

        int day = date.getDayOfMonth();

        String[] zodiacSigns = {"Козерог", "Водолей", "Рыбы", "Овен", "Телец", "Близнецы", "Рак", "Лев", "Дева", "Весы", "Скорпион", "Стрелец"};

        int[] zodiacStartDay = {23, 21, 20, 21, 21, 22, 22, 23, 22, 24, 24, 23};

        System.out.println("Вывод знака зодиака по дате");
        if ((month == 12 && day >= 23) || (month == 1 && day <= 22)) {
            return zodiacSigns[0];
        }

        for (int i = 1; i < zodiacStartDay.length - 1; i++) {
            if ((month == i && day >= zodiacStartDay[i]) || (month == i + 1 && day < zodiacStartDay[i + 1])) {
                return zodiacSigns[i];
            }
        }
        if (month == 11 && day >= 24 || month == 12) {
            return zodiacSigns[11];
        }
        return "Неизвестный знак зодиака";
    }
    // 6.
    public static int sumDelOfNumber(int num) {
        int sum = 0;

        System.out.println("Сумма делителей числа " + num);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
