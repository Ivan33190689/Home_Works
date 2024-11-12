package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        // 70. Реализовать массив целых чисел от 1 до 100. Вывести чётные числа.

        int[] numArray = new int[50];
        int count = 0;

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = count+=2;
        }
        System.out.println("Вывод массива чётных чисел от 1 до 100");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        // 71. Дан массив с целыми числами. Поменяйте местами первый и второй элементы местами

        int[] array = {1, 2, 3, 4, 5};

        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        System.out.println("\nВывод массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // 72. Дано целое цисло от 1 до 7. Определить будние и выходные дни.

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите день недели: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Будний день");
                break;
            case 2:
                System.out.println("Будний день");
                break;
            case 3:
                System.out.println("Будний день");
                break;
            case 4:
                System.out.println("Будний день");
                break;
            case 5:
                System.out.println("Будний день");
                break;
            case 6:
                System.out.println("Выходной день");
                break;
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Такого дня недели нет :(");
        }
    }
}
