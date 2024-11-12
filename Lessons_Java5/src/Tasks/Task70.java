package Tasks;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task70 {
    public static void main(String[] args) {
        // 226. Пользователь вводит дату рождения. Нужно узнать сколько полных лет

        LocalDate birthDay = LocalDate.of(1989, 6, 19);

        System.out.println("Вывод возраста");
        int years = getAge(birthDay);
        System.out.println(years + " лет");

        // 227. Пользователь вводит три числа. Проверить, что квадрат, больщего числа равен суиие квадратов двух других

        System.out.println(checkPifagor());

        // 228. Дана дата. Проверить, корректна ли дата

        String date = "2020-11-32";

        System.out.println(checkDate(date));

        // 229. Дано число. Отсортировать цифры числа

        int number = 35142;

        sortNumber(number);
    }
    // 1.
    public static int getAge(LocalDate birthDay) {
        LocalDate today = LocalDate.now();

        Period period = Period.between(birthDay, today);

        int years = period.getYears();

        return years;
    }
    // 2.
    public static boolean checkPifagor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        try {
            System.out.println("Проверка чисел на треугольник Пифагора");
            if ((num1 * num1 == num2 * num2 + num3 * num3) || (num2 * num2 == num1 * num1 + num3 * num3) || (num3 * num3 == num1 * num1 + num2 * num2)) {
                return true;
            } else {
                return false;
            }
        } catch (InputMismatchException e) {
            return false;
        }
    }
    // 3.
    public  static  boolean checkDate(String date) {
        System.out.println("Проверка даты на корректность");
        try {
            LocalDate ldate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    // 4.
    public static void sortNumber(int num) {
        String strNum = String.valueOf(num);
        int[] digits = new int[strNum.length()];

        for (int i = 0; i < strNum.length(); i++) {
            digits[i] = Character.getNumericValue(strNum.charAt(i));
        }
        Arrays.sort(digits);
        printNums(digits);
    }
    private static void printNums(int[] digits) {
        System.out.println("Вывод отсортированного числа");
        for (int digit : digits) {
            System.out.print(digit + "");
        }
    }
}
