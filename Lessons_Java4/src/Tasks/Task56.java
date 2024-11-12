package Tasks;

import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        // 172. Ввод через консоль двух чисел. Вывести сумму чисел

        int sumNumbers = printAtUserNums();
        System.out.println(sumNumbers);

        // 173. Дано число. Проверить, есть ли среди цифр зтого числа одинаковые

        int num = 133;

        System.out.println("Проверка числа на повторные цифры в нём");
       boolean isRepiteDigit = digitsOfNum(num);
       System.out.println(isRepiteDigit);

        // 174. Дан массив. Вывести в консоль элементы этого массива

        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println("Вывод матрицы");
        printArr2D(arr2D);

        // 175. Напишите программу, которая выведет в консоль пирамидку


        System.out.println("Вывод пирамидки");
        getPiramid();
    }
    // 1.
    public static int printAtUserNums() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.println("Сумма чисел, введённых с консоли");
        int sum = num1 + num2;

        return sum;
    }
    // 2.
    public  static boolean digitsOfNum(int num) {
        String numberStr = String.valueOf(num);

        int[] digits = new int[10];

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            digits[digit]++;

            if (digits[digit] > 1) {
                return true;
            }
        }
        return false;
    }
    // 3.
    public static void printArr2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
    // 4.
    public static void getPiramid() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
