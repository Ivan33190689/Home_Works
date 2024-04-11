import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n),
        // System.out.println(findTriangularNumber(10));
        // n! (произведение чисел от 1 до n)
        // System.out.println(factorial(10));
        // Вывести все простые числа от 1 до 1000
        // getPrimeNumbers(1000);
        // Реализовать простой калькулятор
        // System.out.println(calculator());

    }
    public static int findTriangularNumber(int n) {
        return n*(n+1)/2;
    }
    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
    public static void getPrimeNumbers(int limit) {
        System.out.println("Выводим простые числа от 1 до 1000: ");
        if (limit <= 1) {
            System.out.println("STOP");
        }
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
    public static double calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.print("Введите оператор (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Mistake");
        }
        return result;
    }
}
