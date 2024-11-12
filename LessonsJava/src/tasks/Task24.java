package tasks;

public class Task24 {
    public static void main(String[] args) {
        // 46. Дано целое число. Найти факториал этого числа

        byte num = 12;
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact + " - факториал " + num);

        // 47. Найти среднее арифметическое чисел от 1 до 100

        double middle = 0;
        int summa = 0;

        for (int i = 1; i <= 100; i++) {
            summa +=i;
        }
        middle = (double) summa / 100;
        System.out.println(summa + " - сумма чисел от 1 до 100");
        System.out.println(middle + " - среднее арифметическое чисел от 1 до 100");

        // 48. Дано целое число. Найти сумму первой и последней цифры

        int n = 12345;
        int n1 = n;
        int firstDigit = 0;
        int lastDigit = n % 10;
        int s = 0;

        while (n >= 10) {
            n /= 10;
            firstDigit = n;
        }
        s = firstDigit + lastDigit;
        System.out.println("Вывод суммы первой и последней цифр числа " + n1);
        System.out.println(firstDigit + " + " + lastDigit + " = " + s);
    }
}
