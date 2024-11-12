package Tasks;

import java.util.Stack;

public class Task49 {
    public static void main(String[] args) {
        // 141. Дана строка. Замените в ней все гласные буквы

        String input = "Hello World!";

        System.out.println("Вывод " + input);
        String newString = removeVowels(input);
        System.out.println("Вывод без гласных букв " + newString);

        // 142. Дано целое число. Проверьте, что оно имеет один делитель кроме самого себя и единицы.

        int num = 7;

        System.out.println("Проверка на один делитель числа кроме самого числа и единицы");
        boolean onlyDivisor = hasOnlyDivisor(num);
        System.out.println(onlyDivisor);

        // 143. Написать программу, которая будет выводить строку в формате "xxx xxx xxx"

        String formatNum = "";

        System.out.println("Вывод строки в формате");
        String fNum = formatNumber(formatNum);
        System.out.println(fNum);

        // 144. Дан массив. Получить каждый второй элемент

        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Вывод элементов массива через один");
        printSecondsElemArray(array);

        // 145. Дан массив символов в виде цифр. Слейте их в одно число

        char[] nums = {'1', '2', '3', '4', '5'};

        System.out.println("\nВывод числа, преобразованного из массива символов");
        int numberFromCharArray = numFromCharArray(nums);
        System.out.println(numberFromCharArray);
    }
    // 1.
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouyAEIOUY]", "");
    }
    // 2.
    public static boolean hasOnlyDivisor(int num) {
        int divisorCount = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) divisorCount++;
            if (divisorCount == 3) return true;
        }
        return false;
    }
    // 3.
    public static String formatNumber(String formatNumber) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            formatNumber += "x";
        }
        for (int i = 0; i < formatNumber.length(); i+=3) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(formatNumber, i, Math.min(i + 3, formatNumber.length()));
        }
        return sb.toString();
    }
    // 4.
    public static void printSecondsElemArray(int[] arr) {
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
    // 5.
    public static int numFromCharArray(char[] arr) {
        int number = 0;

        for (char num : arr) {
            number = number * 10 + (num - '0');
        }
        return number;
    }
}
