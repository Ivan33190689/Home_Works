package Tasks;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.LineUnavailableException;
import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        // 176. Попросить пользователя ввести с консоли 10 чисел для заполнения массива

        int[] arr = new int[10];

        userPressArray(arr);

        // 177. Дан массив. Найти сумму элементов массива

        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println("\nВывод суммы элементов массива");
        int sumElems = sumElements(nums);
        System.out.println(sumElems);

        // 178. Дан массив. Вывести элементы, которые начинаются на 1 или 2

        int[] arrNums = {100, 200, 300, 400, 500};

        printElementStartFirstOrTwoo(arrNums);

        // 179. Дан массив. Вывести второе число, содержащее цифру 3

        int[] arrNumbers = {123, 987, 345, 567};

        System.out.println("\nВывод второго элемента массива с цифрой 3");
        printElementStartFirstOrTwoo(arrNumbers);

        // 180. Вывести пирамиду.

        printPyramide();
    }
    // 1.
    public static void userPressArray(int[] arr) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ввод 10 чисел массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Вывод массива");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    // 2.
    public static int sumElements(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    // 3.
    public static void printElementStartFirstOrTwoo(int[] arr) {
        for (int num : arr) {
            if (num / 100 == 1 || num / 100 == 2) {
                System.out.print(num + " ");
            }
        }
    }
    // 4.
    public static void printSecondNumWhithTree(int[] arr) {
        int count = 0;
        int secondElementWith3 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).charAt(i) == '3') {
                count++;
                if (count == 2) {
                    secondElementWith3 = arr[i];
                    break;
                }
            }
        }
        if (count != -1) {
            System.out.println("Второе число, содержащее цифру 3: " + secondElementWith3);
        } else {
            System.out.println("Нет второго числа с цифрой 3");
        }
    }
    // 5.
    public static void printPyramide() {
        int number = 5;

        System.out.println("\nВывод пирамиды");
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
