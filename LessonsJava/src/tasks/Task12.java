package tasks;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // 10. Дано целое число. Вывести количество цифр этого числа.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        long number = scanner.nextLong();

        int countDigits = 0;

        while (number != 0) {
            number /= 10;
            countDigits++;
        }
        System.out.println(countDigits + " - количество цифр в числе");

        // 11. Даны два целых числа.
        // Определите, что первые их цифры совпадают.

        Scanner scn = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int n1 = scn.nextInt();
        System.out.print("Введите второе число: ");
        int n2 = scn.nextInt();

        String D1 = Integer.toString(n1);
        String D2 = Integer.toString(n2);

        char firstD1 = D1.charAt(0);
        char firstD2 = D2.charAt(0);

        System.out.println("Равны ли первые цифры этих чисел?");
        System.out.println(firstD1 == firstD2);

        // 12. Выведите в консоль все целые числа от 1 до 100.

        System.out.println("Вывод целых чисел от 1 до 100");
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + " ");
        }
    }
}
