package tasks;

import javax.naming.PartialResultException;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // Реализуйте алгоритм сортировки пузырьком, используя массив.

        int[] array = new int[11];
        Random rand = new Random();

        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1, 101);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\n\nОтсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
