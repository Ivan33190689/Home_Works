package tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // 22. Дано целое число, содержащее количество килобайт. Переведите это значение в байты.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество килобайт: ");
        int k = scanner.nextInt();

        int res = k * 1024;

        System.out.println(res + " байт");

        // 23. Вывести сумму чисел в диапазоне от 1 до 100

        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            sum +=i;
        }
        System.out.println(sum + " - сумма чисел от 1 до 100");

        // 24. Даны три символа. Сложите эти символы, как целые числа.

        char char1 = '1';
        char char2 = '2';
        char char3 = '3';

        int summa = (int) char1 + (int) char2 + (int) char3;

        System.out.println("Сумма символов = " + summa);
    }
}
