package tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        // 19. Выведите в консоль все целые числа, кратные 3 в промежутке от 1 до 100

        System.out.println("Вывод целых чисел от 1 до 100 кратные 3");

        for (int i = 3; i <= 99; i+=3) {
            System.out.print(i + " ");
        }
        // 20. Даны два числа. Проверьте, что они делятся без остатка.

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        boolean res = true;

        if (num1 % num2 == 0) {
            System.out.println(res);
        }
        if (num1 % num2 != 0) {
            System.out.println(res = false);
        }
        // 21. Даны три символа. Преобразовать символы в строку

        char s1 = 'a';
        char s2 = 'b';
        char s3 = 'c';

        String str = "" + s1 + s2 + s3; // преобразование в строку
        System.out.println(str + " - вывод при помощи строки");

        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2).append(s3);
        System.out.println(sb + " - вывод при помощи StringBuilder");
    }
}



