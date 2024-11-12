package tasks;

import javax.swing.*;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // 1. Проверка числа отрицательное ли оно.

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = scan.nextInt();

        if (num == 0) return;

        if (num < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        // 2. Вывести в консоль длину строки.
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Введите слово:");
        String text = scan2.nextLine();

        System.out.println(text.length());

        // Вывести последний символ строки.
        System.out.println("Последний символ строки: ");

        char lastChar = text.charAt(text.length() - 1);

        System.out.println(lastChar);
    }
}
