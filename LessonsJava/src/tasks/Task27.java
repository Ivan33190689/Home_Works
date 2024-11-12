package tasks;

public class Task27 {
    public static void main(String[] args) {
        // 55. Дан массив с целыми числами. Увеличьте каждый элемент массива в два раза

        int[] arrayOfNums = {1, 2, 3, 4, 5};

        System.out.println("Увеличение всех элементов массива в 2 раза");
        for (int i = 0; i < arrayOfNums.length; i++) {
            arrayOfNums[i] *= 2;
            System.out.print(arrayOfNums[i] + " ");
        }
        // 56. Дан массив целых чисел. Выведите массив с элементами от 10 до 1

        int[] arrNums = new int[10];
        int count = 10;

        System.out.println("\n Вывод элементов массива от 10 до 1");
        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = count--;
            System.out.print(arrNums[i] + " ");
        }
        // 57. Дан массив с целыми числами. Найти сумму положительных элементов

        int[] array = {1, 2, -3, 4, -5, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) sum += array[i];
        }
        System.out.println("\n" + sum + " - сумма положительных чисел массива");
    }
}
