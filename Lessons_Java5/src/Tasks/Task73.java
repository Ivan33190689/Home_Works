package Tasks;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Task73 {
    public static void main(String[] args) {
        // 239. Вывести день недели и проверить, является ли этот день недели выходным или рабочим днём

        boolean today = checkOfDay();

        if (today) {
            System.out.println("Сегодня выходной");
        } else {
            System.out.println("Сегодня рабочий день");
        }
        // 240. Попросите пользователя ввести дату. Вывести в консоль все пятницы 13-е

        printFriday13();

        // 241. Дана строка со словами. Отсортируйте слова по алфавиту

        String word = "JAVA, C#, PYTHON, HTML, SQL";

        sortString(word);

        // 242. Дана строка с датой. Добавить в месяц и день 0

        String date = "2025-2-1";

        getJoinZero(date);

        // 243. Вывести строку "-1-22-333-4444-55555-";

        String str = printString();
        System.out.println(str);
    }
    // 1.
    public static boolean checkOfDay() {
        LocalDate today = LocalDate.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();

        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
    // 2.
    public static void printFriday13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        LocalDate date = LocalDate.of(year, 1, 13);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Вывод пятниц 13-го в " + year + " году");
        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println(date.format(formatter));
            }
            date = date.plusMonths(1);
        }
    }
    // 3.
    public static void sortString(String word) {
        String[] words = word.split(" ");

        Arrays.sort(words);

        System.out.println("Отсортированная строка со словами");
        for (String w : words) {
            System.out.print(w + " ");
        }
    }
    // 4.
    public static void getJoinZero(String date) {
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        System.out.println("Вывод даты с нулём в месяце и дне");
        System.out.printf("%04d-%02d-%02d", year, month, day);
    }
    // 5.
    public static String printString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append("-");
            for (int j = 1; j <= i; j++) {
                sb.append(i);
            }
        }
        sb.append("-");
        return sb.toString();
    }
}
