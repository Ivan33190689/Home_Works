package tasks;

import javax.swing.plaf.IconUIResource;

public class Task5 {
    public static void main(String[] args) {
        // Проверка, является ли заданное число простым.

        System.out.println(isPrime(29));
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
