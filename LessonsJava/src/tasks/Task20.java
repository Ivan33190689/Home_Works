package tasks;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        // 34. Дано целое число, содержащее количество байт. Переведите это значение в гигабайты, мегабайты и килобайты.

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество байт: ");
        long b = scan.nextLong();
        getGbMbKb(b);

        // 35. Даны два слова. Проверьте, что последняя буква первого слова совпадает с первой буквой второго слова

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();

        char char1 = word1.charAt(word1.length() - 1);
        char char2 = word2.charAt(0);

        if (char1 == char2) {
            System.out.println("Эти символы равны");
        }else {
            System.out.println("Эти символы не совпадают");
        }
        // 36. Напишите программу, которая узнаёт сколько секунд содержится в сутках

        int hour = 60 * 60;
        int day = 24;
        int res = hour * day;

        System.out.println(res + " секунд в одних сутках");
    }
    public static void getGbMbKb(long b) {
        long gb = b / 1073741824;
        System.out.println(gb + " ГБ");

        long mb = b / 1048576;
        System.out.println(mb + " МБ");

        long kb = b / 1024;
        System.out.println(kb + " КБ");
    }
}
