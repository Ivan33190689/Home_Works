package Tasks;

import java.util.Scanner;

public class Task58 {
    public static void main(String[] args) {
        // 181. Попросите пользователя ввести 10 чисел через консоль и выведите сумму этих элементов

        int[] arrNums = new int[10];

        System.out.println("Вывод суммы элементов массива");
        int sumNumbers = sumNumbers(arrNums);
        System.out.println(sumNumbers);

        // 182. Напишите программу, которая выведет пирамиду

        System.out.println("Вывод пирамиды");
        printPeramyde();

        // 183. Дан массив. Вывести сумму элементов этого массива

        int[][][] arr3D = {
                {
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                },
                {
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                },
                {
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5},
                },
        };

        System.out.println("Вывод cуммы элементов трёхмерного массива");
        int sumElements = printArray3D(arr3D);
        System.out.println(sumElements);
    }
    // 1.
    public static int sumNumbers(int[] arr) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 10 элементов");
        for (int i = 0; i < arr.length; i++) {
            sum += scan.nextInt();
        }
        return sum;
    }
    // 2.
    public static void printPeramyde() {
        int num = 5;

        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    // 3.
    public static int printArray3D(int[][][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    sum += arr[i][j][k];
                }
            }
        }
        return sum;
    }
}
