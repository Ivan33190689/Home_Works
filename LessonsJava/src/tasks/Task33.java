package tasks;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Task33 {
    public static void main(String[] args) {
        // 73. Написать программу, которая переводит градусы по цельсию в градусы Фаренгейта

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Преобразование градусов Цельсия в Фаренгейты");
        System.out.println(celsius + " градус(а) Цельсия" + " = " + fahrenheit + " градус(а) Фаренгейта");

        // 74. Дана переменная, определяющая радиус шара. Получить обьём и площадь поверхности этого шара

        double radius = 10.3;

        double sphereVoluem = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);

        System.out.println("Объём поверхности круга " + sphereVoluem);
        System.out.println("Площадь поверхности круга " + surfaceArea);

        // 76. Дан массив с целыми числами. Поменяйте местами первый и последний элементы этого массива

        int[] array = {1, 2, 3, 4, 5};

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println("Вывод массива с переменой мест первого и второго элементов массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // 77. Дано число из 6 цифр. Проверьте, что сумма первых трёх цифр равна сумме вторых трёх цифр этого числа

        int num = 123456;

        boolean sumElements = sum3On3Elements(num);

        System.out.println("\n" + sumElements);
    }
    public static boolean sum3On3Elements(int num) {

        // Проверка на 6-ти значное число
        if (String.valueOf(num).length() != 6) return false;

        // Создание первого 3-х значного числа
        int firstNumbers = num / 1000;

        // Создание второго 3-х значного числа
        int lastNumbers = num % 1000;

        // Cоздание сумм
        int sumFirst = 0;
        int sumLast = 0;

        // Получение первой суммы
        while (firstNumbers > 0) {
            sumFirst += firstNumbers % 10;
            firstNumbers /= 10;
        }

        // Получение второй суммы
        while (lastNumbers > 0) {
            sumLast += lastNumbers % 10;
            lastNumbers /= 10;
        }

        // Проверка сумм
        if (sumFirst == sumLast) {
            return true;
        }
        return false;
    }
}
