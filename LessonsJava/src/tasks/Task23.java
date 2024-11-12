package tasks;

public class Task23 {
    public static void main(String[] args) {
        // 43. Дан массив целых чисел. Выведите массив в консоль

        int[] arr = {1, 2, 3, 4, 5, 6, 8, 10};

        System.out.println("Вывод массива");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 44. Дан массив строк. Вывести первые символы элементов массива

        String[] strArr = {"ab", "cd", "ef"};

        System.out.println("\n" + "Вывод первых символов массива");
        System.out.println(strArr[0]);

        // 45. Дано целое число. Найти сумму чётных цифр этого числа

        int num = 12345;
        int sum = 0;

        while (num > 0) {
           int dig = num % 10;
            if (dig % 2 == 0) {
                sum += dig;
            }
            num /= 10;
        }
        System.out.println(sum);
    }
}
