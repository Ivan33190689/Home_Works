package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task34 {
    public static void main(String[] args) {
        // 75. Даны два целых числа. Выведите общие делители этих чисел

        int num1 = 12;
        int num2 = 18;

        List<Integer> commonDivisors = findCommonDivisors(num1, num2);

        System.out.println("Общие делители первого и второго числа" + " : " + commonDivisors);
    }
    private static List<Integer> findDivisors(int num) {

        // Создание делителей для каждого числа
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static  List<Integer> findCommonDivisors(int a, int b) {

        // Нахождение делителя первого числа
        List<Integer> divisorsA = findDivisors(a);

        // Нахождение делителя второго числа
        List<Integer> divisorsB = findDivisors(b);

        // Нахождение общих делителей
        List<Integer> commonDivisors = new ArrayList<>();

        for (Integer divisors : divisorsA) {
            if (divisorsB.contains(divisors)) {
                commonDivisors.add(divisors);
            }
        }
        return commonDivisors;
    }
}
