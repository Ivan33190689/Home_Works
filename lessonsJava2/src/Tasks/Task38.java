package Tasks;

import java.util.Arrays;

public class Task38 {
    public static void main(String[] args) {
        // 93. Дан массив с числами. Посчитать, сколько элементов с отрицательным значением.

        int[] arr = {1, -2, -3, 4, -5, 6};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) count++;
        }
        System.out.println(count + " количество отрицательных элементов");

        // 94. Дано целое число. Проверить его цифры на нечётность

        int num = 1357;

        boolean isOddDigits = true;

        while (num > 0) {
            int digit = num % 10;
            if(digit % 2 == 0) isOddDigits = false;
            num /= 10;
        }
        if (isOddDigits) {
            System.out.println("Все цифры числа нечётные");
        }else {
            System.out.println("Хоть одна цифра числа чётная");
        }
        // 95. Дано целое число. Преобразовать его в массив

        int number = 12345;

        int[] digits = new int[String.valueOf(number).length()];
        int index = digits.length - 1;

        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        System.out.println("Вывод массива");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        // 96. Даны два массива. Объединить их в один

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] combined = new int[arr1.length + arr2.length];
        combined = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);

        System.out.println("\nВывод объединённого массива");
        for (int element : combined) {
            System.out.print(element + " ");
        }
    }
}
