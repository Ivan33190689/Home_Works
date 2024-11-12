package tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        // 28. Напишите код, который выведет первые N степеней числа

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите степень числа: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            int power = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
        }
        // 29. Даны три строки. Сложите эти строки, как целочисленные значения.

        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        int sum = 0;

        for (int i = 0; i < str1.length(); i++) {
            sum += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            sum += str2.charAt(i);
        }
        for (int i = 0; i < str3.length(); i++) {
            sum += str3.charAt(i);
        }
        System.out.println(sum);

        // 30. Дано некоторое число. Переверните его.

        int n = 12345;

        while (n > 0) {
            int res = n % 10;
            System.out.print(res);
            n /= 10;
        }
    }
}
