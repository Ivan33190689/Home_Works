package tasks;

public class Task4 {
    public static void main(String[] args) {
        // Нахождение факториала числа.

        System.out.println(factorial(-6));
    }
    public static int factorial(int number) {
        if (number < 1) return 0;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
