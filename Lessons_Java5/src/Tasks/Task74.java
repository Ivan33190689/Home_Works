package Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class Task74 {
    public static void main(String[] args) {
        // 244. Вывести количество дней до воскресенья

       int daysToSunday = printDaysToSunday();
        System.out.println(daysToSunday);

        // 245. Выведите название дня недели последнего дня текущего месяца

        printLastDayOfWeekOfMonth();

        // 246. Написать код, в котором нужно сравнить две даты и вывести сообщение какая из них больше

        String date1 = "2020-11-30";
        String date2 = "2020-12-31";

        compareOfDate(date1, date2);

        // 247. Дана строка с числом. Отделите тройки пробелами, начиная с конца строки

        String number = "1234567";

        plusProbel(number);
    }
    // 1.
    public static int printDaysToSunday() {
        LocalDate today = LocalDate.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();

        int daysToSunday;

        switch (dayOfWeek) {
            case MONDAY:
                daysToSunday = 6;
                break;
            case TUESDAY:
                daysToSunday = 5;
                break;
            case WEDNESDAY:
                daysToSunday = 4;
                break;
            case THURSDAY:
                daysToSunday = 3;
                break;
            case FRIDAY:
                daysToSunday = 2;
                break;
            case SATURDAY:
                daysToSunday = 1;
                break;
            case SUNDAY:
                daysToSunday = 0;
                break;
            default:
                throw new IllegalArgumentException("Неизвестный день недели" + dayOfWeek);
        }
        System.out.println("Количество дней до воскресенья:");
        return daysToSunday;
    }
    // 2.
    public static void printLastDayOfWeekOfMonth() {
        LocalDate today = LocalDate.now();

        LocalDate lastDateOfMonth = today.withDayOfMonth(today.lengthOfMonth());

        DayOfWeek lastDayOfWeekOfMonth = lastDateOfMonth.getDayOfWeek();

        System.out.println("Последний день недели в месяце " + lastDayOfWeekOfMonth);
    }
    // 3.
    public static void compareOfDate(String date1, String date2) {
        int result = date1.compareTo(date2);

        if (result > 0) {
            System.out.println(date1 + " > " + date2);
        } else if (result < 0) {
            System.out.println(date2 + " > " + date1);
        } else {
            System.out.println(date1 + " = " + date2);
        }
    }
    // 4.
    public static void plusProbel(String number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {
            if (i % 3 == 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(number.charAt(i));
        }
        System.out.println("Вывод строки с пробелом после каждого третьего символа");
        System.out.println(stringBuilder.reverse().toString());
    }
}
