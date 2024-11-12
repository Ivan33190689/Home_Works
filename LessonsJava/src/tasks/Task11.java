package tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // 7. Дано число. Выведите в консоль первую цифру этого числа.

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = sc.nextInt();

        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        System.out.println(firstDigit + " - первая цифра числа");

        // 8. Дано число. Вывести последнюю цифру этого числа.

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scan.nextInt();

        int lastDigit = num % 10;

        System.out.println(lastDigit + " - последняя цифра числа");

        // 9. Вывести сумму первой и последней цифры числа.

        int sum = firstDigit + lastDigit;

        System.out.println("Сумма первой и последней цифры числа = " + sum);
    }
}
