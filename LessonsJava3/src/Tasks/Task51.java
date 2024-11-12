package Tasks;

import javax.naming.NamingEnumeration;

public class Task51 {
    public static void main(String[] args) {
        // 150. Дана строка. Проверьте, что эта строка состоит из цифр

        String strNums = "1, 2, 3";

        System.out.println("Проверка строки на содержание чисел");
        checkOfStringIsDigits(strNums);

        // 151. Дано целое число. Получить первую чётную цифру с конца

        int num = 12345;

        findEndEvenDigit(num);

        // 152. Напишите программу, которая сформирует следующую строку "54321"

        System.out.println("Вывод строки числа");
        String strOfNumber = getStringNumbers();
        System.out.println(strOfNumber);

        // 153. Дан массив с целыми числами. Вывести в консоль только те числа, в которых содержится нуль

        int[] arrNums = {123, 102, 345, 350};

        System.out.println("Вывод чисел массива, содержащих 0");
        numberContainsZero(arrNums);

        // 154. Дана строка. Получить каждый второй символ этой строки

        String word = "abcdef";

        System.out.println("\nВывод каждого второго символа строки");
        printSecondChars(word);

        // 155. Дан массив с числами. Создайте новый массив и добавьте в него все элементы первого массива, кроме нелей

        int[] numArray = {1, 2, 3, 0, 4, 0, 5, 0};

        System.out.println("\nВывод массива без нулевых элементов");
        newArrayIsNotZero(numArray);
    }
    // 1.
    public static void checkOfStringIsDigits(String str) {
        char[] charArr = str.toCharArray();
        boolean isDigit = false;

        for (char c : charArr) {
            if (Character.isDigit(c)) {
                isDigit = true;
            } else {
                isDigit = false;
            }
        }
        System.out.println(isDigit);
    }
    // 2.
    public static void findEndEvenDigit(int number) {
        int isDigit = -1;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                isDigit = digit;
                break;
            }
            number /= 10;
        }
        if (isDigit != -1) {
            System.out.println(isDigit + " последняя чётная цифра числа");
        }else {
            System.out.println("Нет чётных чисел в числе");
        }
    }
    // 3.
    public static String getStringNumbers() {
        int num = 5;
        StringBuilder getNumbers = new StringBuilder();

        for (int i = num; i > 0; i--) {
            getNumbers.append(i);
        }
        return getNumbers.toString();
    }
    // 4.
    public static void numberContainsZero(int[] arr) {
        for (int num : arr) {
            if (String.valueOf(num).contains("0")) {
                System.out.print(num + " ");
            }
        }
    }
    // 5.
    public static void printSecondChars(String str) {
        char[] c = str.toCharArray();

        for (int i = 1; i < c.length; i+=2) {
            System.out.print(c[i]);
        }
    }
    // 6.
    public static void newArrayIsNotZero(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num != 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                newArr[index++] = num;
            }
        }
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
