package tasks;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        // 67. Дано целое число, cодержащее номер месяца.
        // Выведите название месяца, соответствующее этому числу от 1 до 12.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 12: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Март");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        // 68. Дана строка. Вывести первый и последний символ строки в виде строки

        String str = "12345";

        char firstElem = str.charAt(0);
        char lastElem = str.charAt(str.length() - 1);

        StringBuilder sb = new StringBuilder();

        sb.append(firstElem).append(lastElem);

        System.out.println(sb);

        // 69. Даны переменные, содержащие стороны прямоугольника. Найдите площадь и периметр прямоугольника

        int a = 10;
        int b = 20;

        int s = a * b;
        int p = 2 * (a + b);

        System.out.println(s + " - площадь прямоугольника");
        System.out.println(p + " - периметр прямоугольника");
    }
}
