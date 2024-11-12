package tasks;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        // Написать программу, которая инвертирует массив (меняет местами элементы).

        int[] array = new int[8];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Исходный массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;

        }
        System.out.println("\n\nИнвертированный массив:");

        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
