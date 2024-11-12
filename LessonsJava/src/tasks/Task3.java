package tasks;

import javax.naming.PartialResultException;

public class Task3 {
    public static void main(String[] args) {
        // Напишите программу, которая выолит простые числа в промежутке [2, 100]
        // Используйте оператор % и циклы.

        System.out.println("Вывод простых чисел:\n");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
