package Tasks;

import java.util.*;

public class Task80 {
    public static void main(String[] args) {
        // 273. Дана строка. Проверить, что эта строка содержит цифры

        String str = "61360246";

        boolean strNum = checkString(str);

        if (strNum) {
            System.out.println("Строка содержит цифры");
        } else {
            System.out.println("Строка не содержит цифры");
        }
        // 274. Дана строка. Проверить, находится ли в строке дробное число

        String strDouble = "3/4";

        boolean checkOnFraction = checkStringOnFraction(strDouble);

        if (checkOnFraction) {
            System.out.println("Строка содержит дробное число");
        }else {
            System.out.println("Строка не содержит дробное число");
        }

        // 275. Создать метод, который будет принимать массив и возвращать второе по величине число

        int[] array = {1, 63, 0, 27, 36, 57, 48};

        int secondMaxNumber = printSecondMaxNumber(array);
        System.out.println(secondMaxNumber);

        // 276. Создать метод, который будет принимать два параметра целых чисел и выводить массив от минимального к максимальному

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимальное число: ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальное число: ");
        int max = scanner.nextInt();

        ptintArray(min, max);

        // 277. Создать массив, который нужно заполнить случайными латинскими буквами

        printLettersArray();

        // 278. Создать метод, который будет возвращать сумму N первых чисел Фибоначчи

        Scanner sc = new Scanner(System.in);

        System.out.print("\nВведите число Фибоначчи (N): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Введите положительное число!");
        }

        int sumFirstOfNums = sumFirstNumsFebonachchi(N);
        System.out.println("Сумма первых N чисел Фибоначчи " +  N + " = " + sumFirstOfNums);
    }
    // 1.
    public static boolean checkString(String str) {
        if (str.matches(".*\\d.*")) {
            return true;
        }
        return false;
    }
    // 2.
    public static boolean checkStringOnFraction(String str) {
        if (str.matches("^-?\\d+/\\d+$")) {
            return true;
        }
        return false;
    }
    // 3.
    public static int printSecondMaxNumber(int[] array) {
        System.out.println("Вывод массива");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        System.out.println("Вывод второго максимального числа");
        return array[array.length - 2];
    }
    // 4.
    public static void ptintArray(int min, int max) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            arrayList.add(i);
        }
        int[] arrayNum = new int[arrayList.size()];
        int index = 0;

        for (int num : arrayList) {
            arrayNum[index++] = num;
        }
        printArray(arrayNum);
    }
    private static void printArray(int[] arr) {
        System.out.println("Вывод массива");
        System.out.println(Arrays.toString(arr));
    }
    // 5.
    public static char[] printLettersArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        char[] letters = new char[size];
        Random rand = new Random();

        for (int i = 0; i < letters.length; i++) {
            char randomLetter = (char) ('A' + rand.nextInt(26));
            randomLetter = (char) ('a' + rand.nextInt(26));
            letters[i] = randomLetter;
        }
        printCharArray(letters);
        return letters;
    }
    private static void printCharArray(char[] letters) {
        System.out.println("Вывод массива:");
        for (char letter : letters) {
            System.out.print(letter + ", ");
        }
    }
    // 6.
    public static int sumFirstNumsFebonachchi(int N) {
        int sum = 0;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                sum += a;
            } else if (i == 2){
                sum += b;
            } else {
                int next = a + b;
                sum += next;
                a = b;
                b = next;
            }
        }
        return sum;
    }
}
