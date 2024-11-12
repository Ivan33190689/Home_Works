package tasks;

public class Task1 {
    public static void main(String[] args) {
        // Реализовать массив с рандомными значениями, используя метод Math.random().
        // Вывести максимальное и минимальное числа и среднее значение чисел.

        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double mid = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            mid = array[i] / array.length;
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее значение чисел: " + mid);
    }
}
