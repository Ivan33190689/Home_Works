package Tasks;

public class Task45 {
    public static void main(String[] args) {
        // 125. Дано целое число. Выведите в консоль позиции всех 0 за исключением первого и последнего.

        long number = 1020330450;
        String indexesZero = String.valueOf(number);

        for (int i = 2; i < indexesZero.length() - 1; i++) {
            if (indexesZero.charAt(i) == '0') {
                System.out.print(i + " ");
            }
        }
        // 126. Дан массив целых чисел. Вывести числа цифры которых не повторяются

        int[] numArray = {123, 334, 456, 556, 789};

        uniqueNumbers(numArray);

        // 127. Дано дробное число. Запишите его целую часть и дробную в разные переменные

        double num = 12.34;

        int part1 = (int) num;
        double doublepart = num - part1;

        System.out.println("\nЦелая чаcть " + num + " = " + part1);
        System.out.println("Дробная часть " + num + " = " + doublepart);
    }
    public static void uniqueNumbers(int[] arr) {
        System.out.println("\nВывод массива с уникальными числами");
        for (int num : arr) {
            if (isUniqueDigits(num)) {
                System.out.print(num + " ");
            }
        }
    }
    private static boolean isUniqueDigits(int num) {
        boolean[] digits = new boolean[10];

        while (num > 0) {
            int digit = num % 10;
            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            num /= 10;
        }
        return true;
    }
}
