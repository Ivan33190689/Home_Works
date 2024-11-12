package Tasks;

public class Task59 {
    public static void main(String[] args) {
        // 184. Дано число. Проверьте, что цифры этого числа расположены по возрастанию

        int num = 12345;

        System.out.println("Проверка на возрастание цифр в числе");
        boolean digitsAscending = isDigitsAscending(num);
        System.out.println(digitsAscending);

        // 185. Дан массив. Вывести первые числа этого массива

        int[] arrNums = {123, 456, 789};

        System.out.println("Вывод первых цифр массива");
        arrDigits(arrNums);

        // 186. С помощью циклов сформировать массив

        char[][] arr2D = printArr();

        System.out.println("\nВывод массива");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 1.
    public static boolean isDigitsAscending(int num) {
        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length() - 1; i++) {
            if (strNum.charAt(i) >= strNum.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    // 2.
    public static void arrDigits(int[] arr) {

        for (int elem : arr) {
            System.out.print(elem / 100 + " ");
        }
    }
    public static char[][] printArr() {
        char[][] arr2D = new char[3][3];

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = 'x';
            }
        }
        return arr2D;
    }
}
