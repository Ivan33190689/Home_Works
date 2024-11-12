package Tasks;

public class Task55 {
    public static void main(String[] args) {
        // 169. Дан массив целых чисел. Поделить сумму элементов, стоящих на чётных позициях на сумму нечётных позициях

        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println(("Вывод деления суммы элементов на чётных и нечётных позициях"));
        double result = delSumNumbers(nums);
        System.out.println(result);

        // 170. Дана строка. Перевести в верхний регистр все подстроки, меньше или равные трём символам

        String str = "a, bc, def, ghij";

        System.out.println("Вывод слов с заглавными буквами, которые содержат до трёх символов");
        String newStr = printUpperString(str);
        System.out.println(newStr);

        // 171. Дана строка со словами. Сделать заглавным первый символ каждого второго слова

        String word = "aaa, bbb, ccc, eee, ddd, fff";

        System.out.println("Вывод слов, у которых каждое второе слово начинается с заглавной буквы");
        String evenWordFirstChar = getCapitalizeEvenOfWordOfFirstChar(word);
        System.out.print(evenWordFirstChar);
    }
    // 1.
    public static double delSumNumbers(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                sum1 += arr[i];
            }else {
                sum2 += arr[i];
            }
        }
        result = (double) sum1 / sum2;
        return result;
    }
    // 2.
    public static String printUpperString(String str) {
        String[] strArr = str.split(", ");
        StringBuilder newStr = new StringBuilder();

        for (String s : strArr) {
            if (s.length() <= 3) {
                newStr.append(s.toUpperCase()).append(", ");
            }else {
                newStr.append(" " + s);
            }
        }
        return newStr.toString();
    }
    // 3.
    public static String getCapitalizeEvenOfWordOfFirstChar(String word) {
        String[] words = word.split(", ");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                res.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(", ");
            }else {
                res.append(words[i]).append(", ");
            }
        }
        return res.substring(0, res.length() - 2);
    }
}
