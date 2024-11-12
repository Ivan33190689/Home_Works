package Tasks;

public class Task52 {
    public static void main(String[] args) {
        // 156. Дан массив с целыми числами. Проверьте, что в нём соделжится число, содержащее цифру 3

        int[] numbers = {123, 456, 789};

        System.out.println("Проверка чисел массива на содержание 3 в числе");
        boolean checkIsDigitOnTheTreeInNumber = checkOnTheDigitThree(numbers);
        System.out.print(checkIsDigitOnTheTreeInNumber);

        // 157. Дан массив строк из чисел. Найти сумму элементов массива

        String[] strNumbers = {"1", "2", "3", "4", "5"};

        System.out.println("\nСумма элементов массива");
        int sumElemIsArr = sumNumbersOfArray(strNumbers);
        System.out.print(sumElemIsArr);

        // 158. Дана строка. Сменить регистр строк на противоположный

        String word = "AbCdE";

        System.out.println("\nВывод строки в противоположном регистре");
        anodeRegister(word);

        // 159. Написать программу, которая будет выводить следующую строку "-1-2-3-4-5-"

        System.out.println("\nВывод строки в формате:");
        String strFormat = printStringFormat();
        System.out.print(strFormat);

        // 160. Дана дата "31-12-2025". Получить "31 декабря 2025";

        String date = "31-12-2025";

        System.out.println("\nВывод из 31-12-2025 в:");
        String newDate = printNewDate(date);
        System.out.print(newDate);
    }
    // 1.
    public static boolean checkOnTheDigitThree(int[] arr) {
        for (int num : arr) {
            if (String.valueOf(num).contains("3")) {
                return true;
            }
        }
        return false;
    }
    public static int sumNumbersOfArray(String[] arr) {
        int sum = 0;

        for (String num : arr) {
            sum += Integer.parseInt(num.trim());
        }
        return sum;
    }
    // 3.
    public static void anodeRegister(String str) {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(Character.toLowerCase(charArr[i]));
            }else {
                System.out.print(Character.toUpperCase(charArr[i]));
            }
        }
    }
    // 4.
    public static String printStringFormat() {
        StringBuilder strFormat = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            strFormat.append("-").append(i);
        }
        strFormat.append("-");
        return strFormat.toString();
    }
    public static String printNewDate(String date) {
        String newDate = date.replace("-12-", " декабря ");

        return newDate;
    }
}
