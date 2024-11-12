package Tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task48 {
    public static void main(String[] args) {
        // 136. Выведите в консоль все числа от 10 до 1000, у которых предпоследняя цифра - чётная.

        System.out.println("Вывод чисел, у которых предпоследнее число чётное");
        for (int i = 10; i <= 1000; i++) {
            if (isDigit(i) % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        // 137. Сформируйте строку, которая будет выводить 123456789

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append(i);
        }
        String nums = sb.toString();
        System.out.print("\n" + nums);

        // 138. Даны два целых числа. Вывести их общие делители

        int num1 = 12;
        int num2 = 16;

        System.out.println("\nВывод общих делителей чисел");
        delOfNums(num1, num2);

        // 139. Дана строка с целыми числами. Вывести сумму этих чисел

        String numbers = "123 456 789";

        System.out.println("\nСумма чисел строки");
        int sum = sumStrNumbers(numbers);
        System.out.println(sum);

        // 140. Дана строка слов. Получить первые N слов

        String strWords = "Привет, как дела? Хорошо, спасибо!";

        String[] getFirstWords = firstWords(strWords);

        for (String word : getFirstWords) {
            System.out.print(word + " ");
        }
    }
    // 1.
    public static int isDigit(int num) {
        int digit = 0;

        while (num >= 100) {
            digit = num / 10 % 10;
            num /= 10;
        }
        return digit;
    }
    // 3.
    public static void delOfNums(int num1, int num2) {
        List<Integer> listDel1 = delOfNum(num1);
        List<Integer> listDel2 = delOfNum(num2);

        for (Integer num : listDel1) {
            if (listDel2.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
    private static List<Integer> delOfNum(int num) {
        List<Integer> del = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                del.add(i);
            }
        }
        return del;
    }
    // 4.
    public static int sumStrNumbers(String nums) {
        String[] arrayNums = nums.split(" ");
        int sum = 0;

        for (String num : arrayNums) {
            sum += Integer.parseInt(num.trim());
        }
        return sum;
    }
    // 5.
    public static String[] firstWords(String str) {
        String[] words = str.split(" ");

        String[] firstWords = new String[words.length / 2];

        for (int i = 0; i < words.length / 2; i++) {
            firstWords[i] = words[i];
        }
        return firstWords;
    }
}
