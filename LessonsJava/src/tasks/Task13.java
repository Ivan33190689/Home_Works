package tasks;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Task13 {
    public static void main(String[] args) {
        // 13. Дана строка.
        // Если в этой строке более одного символа, выведите в консоль предпоследний символ этой строки.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        int countOfChars = text.length();

        if (countOfChars > 1) {
            System.out.println(text.charAt(text.length() - 2) + " - вывод предпоследнего символа");
        }else {
            System.out.println("В строке менее двух символов");
        }
        // 14. Даны два целых числа. Найдите остаток от деления первого числа на второе.

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        int result = num1 % num2;

        System.out.println(result + " - остаток от деления");

        // 15. Дано целое число, содержащее номер месяца от 1 до 12.
        // Определите, в какую пору года попадают эти значения

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число от 1 до 12: ");
        int number = sc.nextInt();
        String res = "";

        switch (number) {
            case 1:
                res = "Зима";
                System.out.println(res);
                break;
            case 2:
                res = "Зима";
                System.out.println(res);
                break;
            case 3:
                res = "Весна";
                System.out.println(res);
                break;
            case 4:
                res = "Весна";
                System.out.println(res);
                break;
            case 5:
                res = "Весна";
                System.out.println(res);
                break;
            case 6:
                res = "Лето";
                System.out.println(res);
                break;
            case 7:
                res = "Лето";
                System.out.println(res);
                break;
            case 8:
                res = "Лето";
                System.out.println(res);
                break;
            case 9:
                res = "Осень";
                System.out.println(res);
                break;
            case 10:
                res = "Осень";
                System.out.println(res);
                break;
            case 11:
                res = "Осень";
                System.out.println(res);
                break;
            case 12:
                res = "Зима";
                System.out.println(res);
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }
}
