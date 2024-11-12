package tasks;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        // 31. Дано целое число. Найти сумму цифр этого числа.

        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Сумма чисел = " + sum);

        // 32. Дано дробное число, содержащее количество гигабайт. Переведите это число в мегабайты, килобайты, иайты

        double gb = 35.26;

        double mb = gb * 1024;
        System.out.println(mb + " мегабайт");

        double kb = mb * 1024;
        System.out.println(kb + " килобайт");

        double bytes = kb + 1024;
        System.out.println(bytes + " байт");

        // 32. Выведите все целые числа от 100 до 1

        System.out.println("Вывод всех целых чисел от 100 до 1");
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
        // 33. Дана строка. Переберите её и выведите в консоль символы с конца

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите строку: ");
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();

        int charLength = charArray.length;

        for (int i = 0; i < charLength / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charLength - i - 1];
            charArray[charLength - i - 1] = temp;
        }
        System.out.println("Вывод перевёрнутой строки в виде отдельных символов");

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
