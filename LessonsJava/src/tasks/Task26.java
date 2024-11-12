package tasks;

public class Task26 {
    public static void main(String[] args) {
        // 52. Дан массив с целыми числами. Найти среднее арифметическое элементов этого массива

        int[] array = {1, 2, 3, 4, 5, 13};
        int length = array.length;
        int sum = 0;
        double middleOfNums = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        middleOfNums = (double) sum / length;
        System.out.println(middleOfNums + " среднее арифметическое элементов массива");

        // 53. Дан массив. Заполните массив целыми числами от 1 до10

        int[] arr = new int[10];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = count++;
        }
        System.out.println("Вывод массива");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 54. Дан массив целых чисел. Найти сумму квадратных корней элементов массива

        int[] arrayNums = {1, 2, 3, 4, 5};
        double s = 0;

        for (int i = 0; i < arrayNums.length; i++) {
            s += Math.sqrt(arrayNums[i]);
        }
        System.out.println("\n" + s + " сумма квадратных корней элементов массива");
    }
}
