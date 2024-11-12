package tasks;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        // 40. Напишите программу, котроая узнаёт, сколько секунд содержится в году

        int seconds = 60;
        int hour = seconds * seconds;
        int day = hour * 24;
        int year = day * 365;

        System.out.println(year + " секунд в году");

        // 41. Дано целое число. Выведите в консоль все делители этого числа

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.print("Вывод всех делителей " + number + "\n");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.print(i + " ");
        }
        // 42. Дано некоторое число. Делите его на 2 столько раз, пока результат не будет меньше 10.
        // Сколько итераций для этого потребуется

        long num = 12345;
        long n = num;
        int count = 0;

        while (num > 10) {
            num /= 2;
            count++;
        }
        System.out.println("\nКоличество итераций " + n + " = " + count);
    }
}
