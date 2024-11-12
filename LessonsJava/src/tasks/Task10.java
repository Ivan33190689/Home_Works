package tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // 4. Проверить чётное ли число.

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " - чётное число");
        }else {
            System.out.println(number + " - нечётное число");
        }
        // 5. Даны два слова. Проверьте, что первые буквы этих слов равны.

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Введите первое слово:");
        String word = scan2.nextLine();
        System.out.println("Введите второе слово:");
        String word2 = scan2.nextLine();

        if (word.charAt(0) == word2.charAt(0)) {
            System.out.println("Первые буквы этих слов равны");
        } else {
            System.out.println("Первые буквы этих слов не совпадают");
        }
        // 6. Дано слово. Получите последнюю букву этого слова.
        // Если слово заканчивается на ь, получите предпоследнюю букву.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово:");
        String frase = scanner.nextLine();

        char lastChar = frase.charAt(frase.length() - 1);
        char lastChar2 = frase.charAt(frase.length() - 2);

        if (lastChar != 'ь') {
            System.out.println(lastChar + " - последняя буква слова");
        }else {
            System.out.println(lastChar2 + " - предпоследняя буква в слове");
        }
    }
}
