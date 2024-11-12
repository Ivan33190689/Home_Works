package tasks;

public class Task21 {
    public static void main(String[] args) {
        // 37. Выведите все целые числа от -100 до 0

        System.out.println("Вывод всех чисел от -100 до 0");

        for (int i = -100; i <= 0; i++) {
            System.out.print(i + " ");
        }
        // 38. Даны три символа. Преобразуйте их в число

        char char1 = '1';
        char char2 = '2';
        char char3 = '3';

        int num = (char1 - '0') * 100 + (char2 - '0') * 10 + (char3 - '0');

        System.out.println("\n" + num);

        // 39. Вывести в консоль сумму чётных чисел в промежутке от 1 до 100

        int sum = 0;

        for (int i = 2; i <= 100; i+=2) {
            sum += i;
        }
        System.out.println(sum + " сумма чётных чисел от 1 до 100");
    }
}
