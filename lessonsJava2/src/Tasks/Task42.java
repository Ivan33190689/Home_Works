package Tasks;

public class Task42 {
    public static void main(String[] args) {
        // 113. Дан массив целых чисел. Проверьте, что все числа массива содержат цифру 3

        int[] arr = {36, 31, 3, 183, 13};

        boolean checkOfArrOnThree = checkOfArrOnDigitThree(arr);
        System.out.println(checkOfArrOnThree);
    }
    public  static boolean checkOfArrOnDigitThree(int[] array) {
        System.out.println("Проверка на наличие в числах массива цмфры 3");
        for (int num : array) {
            if (!checkOfThree(num)) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkOfThree(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 3)  return true;
            num /= 10;
        }
        return false;
    }
}
