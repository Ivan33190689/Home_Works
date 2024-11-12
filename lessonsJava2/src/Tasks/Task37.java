package Tasks;

import java.util.Arrays;

public class Task37 {
    public static void main(String[] args) {

        // 89. Дано число. Проверить, есть ли 0 в этом числе

        int number = 123045;

        boolean containsZero = checkContainsZero(number);

        if (containsZero) {
            System.out.println("Цифра 0 присутствует в числе");
        }else
            System.out.println("Цифры 0 нет в числе");

        // 90. Дано некоторое слово. Проверить, является ли оно палиндромом

        String word = "abcba";

        boolean isPalindrome = checkOnPalindrome(word);

        System.out.println(isPalindrome);

        // 91. Дан массив. Нужно вывести два последних элемента

        int[] arrayNums = {1, 2, 3, 4, 5, 6};

        int[] slise = Arrays.copyOfRange(arrayNums, 4, 6);

        System.out.println("Вывод двух последних элементов массива");
        for (int elem : slise) {
            System.out.print(elem + " ");
        }
        // 92. Дан массив с дробными числами. Округлите элементы до целой части и выведите в новом массиве

        double[] doubleArray = {1.21, 2.23, 3.45, 4.67, 5.98};
        int[] newArray = new int[doubleArray.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) Math.round(doubleArray[i]);
        }
        System.out.println("\nВывод нового массива с сокращением до целых значений");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
    public static boolean checkContainsZero(int num) {
        // Преобразование в строку
        String numStr = String.valueOf(num);

        return numStr.contains("0");
    }
    public static boolean checkOnPalindrome(String word) {
        char[] charWord = word.toCharArray();

        System.out.println(word + " является ли палиндромом?");
        for (int i = 0; i < charWord.length / 2; i++) {
            if (charWord[i] == charWord[charWord.length - i - 1]) {
                return true;
            }
        }
        return false;
    }
}
