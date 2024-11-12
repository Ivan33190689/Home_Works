package lesson_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String name = "Андрей";
//        String name1 = "Андрей";
//        String name2 = new String("Андрей");
//        // Переприсваивание новой переменной при помощи оператора new.
//
//        System.out.println(name == name1);
//        System.out.println(name == name2);
//
//        int a = 1;
//        int b = 5;
//        int c = 5;
//
//        System.out.println(a <= b); // Операторы сравнения;
//        System.out.println(a == b || b == c);
//        System.out.println(a == b && b == c); // Логические операторы;
//
//        // Логические операторы (условные конструкции).
//
//        int example = 15;
//
//        if (example > 5) {
//            example += 10;
//        }
//        System.out.println(example);
//
//        int example1 = 15;
//
//        if (example1 < 5) {
//            example1 += 10;
//        }
//        else {
//            example1 -= 10;
//        }
//
//        int s = 1;
//
//        switch (s) {
//            case 1:
//                System.out.println("One");
//                break;
//            default:
//                System.out.println("Not of a key");
//                break;
//        }
//        int age = 18;
//        String canVote = (age >= 18) ? "Yes" : "No";
//        System.out.println(canVote);
//
////        Циклы:
//
//
//        for (int i = 0; i <= 5; i++) {
//            int a1 = 1;
//            System.out.println(a1);
//            a1++;
//
//        }
//        int a2 = 1;
//        while (a2 < 5) {
//            System.out.println(a2);
//            a2++;
//        }
//        int[] array = new int[10];
//
//        for (int num : array) {
//            System.out.println(num);
//        }
//        System.out.println("\n");
//
//        String[] names = {"John", "Bob", "Robby", "Jane", "Iren"};
//
//        for (String string : names) {
//            System.out.println(string);
//        }
//        System.out.println("\n");
//
////        Операторы continue и break;
//
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) continue; {
//                if (i > 8) break;
//                {
//                    System.out.println(i);
//                }
//            }
//        }
//        System.out.println("\n");
////        Вывод массива.
//        int[] array2 = new int[5];
//
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = i;
//            System.out.println(array2[i]);
//        }
//        System.out.println("\n");
//
//        String[] strArray = {"One", "Twoo", "Three"};
//
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
//        System.out.println("\n");
//
//        String[] strArray2 = {"One", "Twoo", "Three"};
//        strArray2[1] = "Five";
//
//        for (int i = 0; i < strArray2.length; i++) {
//            System.out.println(strArray2[i]);
//        }
//        System.out.println("\n");
//
//        int[][] array2d = new int[5][5];
//
//        for (int i = 0; i < array2d.length; i++) {
//            for (int j = 0; j < array2d[i].length; j++) {
//                System.out.print(array2d[i][j] + " ");
//            }
//            System.out.println();
//        }
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scan.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols = scan.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
//        Вывод массива в консоль:

        System.out.println("\nВведённый массив:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}