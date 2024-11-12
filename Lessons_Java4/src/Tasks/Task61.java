package Tasks;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        // 191. Напишите программу, которая будет находить корни квадратного уравнения.
        // Спросите у пользователя 3 числа, которые будут коэффициентами уравнения

        sqrt();

        // 192. Сформировать массив

        int[][] array2D = new int[3][3];

        printArr2D(array2D);

        // 193. Даны два числа. Найти общие цифры этих чисел

        int num1 = 12345;
        int num2 = 45678;

        printDoubleDigits(num1, num2);
    }
    // 1.
    public static void sqrt() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.print("Введите третье число: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Уравнение имеет два действительных корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (discriminant == 0) {
            double x = -b / (2 * a);

            System.out.println("Уравнение имеет один корень;");
            System.out.println("x = " + x);
        }else {
            System.out.println("Уравнение не имеет корней;");
        }
    }
    // 2.
    public static void printArr2D(int[][] arr) {
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        System.out.println("Вывод массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
    // 3.
    public static void printDoubleDigits(int num1, int num2) {
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        System.out.println("Вывод одинаковых цифр двух чисел");
        for (int i = 0; i < strNum1.length(); i++) {
            char c1 = strNum1.charAt(i);
            for (int j = 0; j < strNum2.length(); j++) {
                char c2 = strNum2.charAt(j);
                if (c1 == c2) {
                    System.out.print(c1 + " ");
                }
            }
        }
    }
}
