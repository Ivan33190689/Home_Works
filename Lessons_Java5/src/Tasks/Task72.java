package Tasks;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task72 {
    public static void main(String[] args) {
        // 235. Пользователь вводит номер телефона. Проверить, правильно ли введён номер телефона

        boolean isValidNumber = chekcPhoneNumber();

        if (isValidNumber) {
            System.out.println("Номер телефона введён правильно!");
        } else {
            System.out.println("Номер телефона введён неправильно!");
        }
        // 236. Попросите пользователя ввести 10 чисел и поместить их в массив. Вывести среднее арифметическое этих чисел

        printAriphmeticNumbers();

        // 237. Вывести все дни выходных в текущем году

        printWeekends();

        // 238. Дано число. Найти сумму пар этих чисел

        int number = 123456;

        int sum = printSumCupleNumbers(number);
        System.out.println(sum);
    }
    // 1.
    public  static  boolean chekcPhoneNumber() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите номер телефона: ");
        String phoneNumber = scan.nextLine();

        String regex = "^\\+7[-]?\\(?\\d{3}\\)?[-]?\\d{3}[-]?\\d{2}[-]?\\d{2}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
    // 2.
    public  static void printAriphmeticNumbers() {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Введите 10 чисел: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        printArNums(numbers);
    }
    private static void printArNums(int[] numbers) {
        int sum = 0;
        double result = 1;

        System.out.println("Среднее арифметическое чисел");
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(result = (double) sum / 10);
    }
    // 3.
    public static void printWeekends() {
        int currentYear = Year.now().getValue();

        LocalDate currentDate = LocalDate.of(currentYear, 1, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Выходные дни в " + currentYear + " году");

        while (currentDate.getYear() == currentYear) {
            if (currentDate.getDayOfWeek() == DayOfWeek.SATURDAY || currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println(currentDate.format(formatter));
            }
            currentDate = currentDate.plusDays(1);
        }
    }
    // 4.
    public static int printSumCupleNumbers(int number) {
        String num = String.valueOf(number);

        int sum = 0;

        for (int i = 0; i < num.length(); i+=2) {
            int firstDigit = Character.getNumericValue(num.charAt(i));
            int secondDigit = Character.getNumericValue(num.charAt(i + 1));
            sum += firstDigit * 10 + secondDigit;
        }
        System.out.println("Сумма пар цифр числа " + number + ":");
        return sum;
    }
}
