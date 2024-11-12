package tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        // 25. Дано целое число, содержащее количество мегабайт.
        // Переведите это значение в бфйты.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество мегабайт: ");
        int mb = scanner.nextInt();

        int countOfByts = mb * 1048576;

        System.out.println(countOfByts + " байт");

        // 26. Найдите сумму всех нечётных целых чисел от 1 до 100

        int sum = 0;

        for (int i = 1; i <= 99; i+=2) {
            sum += i;
        }
        System.out.println(sum + " - сумма всех нечётных чисел от 1 до 100");

        // 27. Напишите код, который выведет первые N степеней двойки.

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество степеней двойки: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int power = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
        }
    }
}
