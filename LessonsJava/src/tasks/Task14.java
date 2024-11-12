package tasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // 16. Выведите в консоль все чётные числа от 1 до 100.

        System.out.println("Вывод чётных чисел от 1 до 100");
        for (int i = 2; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
        // 17. Дана строка. Переберите и выведите в консоль символы отдельно с конца строки.

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите строку: ");
        String str = scanner.nextLine();

        char[] charArr = reverseChars(str);
        System.out.println(charArr);

        // 18. Дано целое число, содержащее номер минуты от 0 до 60.
        // Определите, в какую четверть часа попадает это значение

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число от 0 до 60: ");
        byte min = scan.nextByte();

        if (min >= 0 && min < 16) {
            System.out.println("Первая четверть часа");
        }
        else if (min > 15 && min < 31) {
            System.out.println("Вторая четверть часа");
        }
        else if (min > 30 && min < 46) {
            System.out.println("Третья четверть часа");
        }
        else if (min > 45 && min <= 60) {
            System.out.println("Четвёртая четверть часа");
        }else {
            System.out.println("Неверный ввод");
        }

    }
    public static char[] reverseChars(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }
        return charArray;
    }
}
