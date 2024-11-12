package Tasks;

import java.rmi.registry.LocateRegistry;

public class Task53 {
    public static void main(String[] args) {
        // 161. Дана строка с буквами. Проверить, что в этой строке количество заглавных букв не более 2

        String letters = "Aaa, Bbb, Ccc";

        System.out.println("Проверка строки на не более двух  заглавных букв");
        boolean checkUpperLetters = checkTwoUppersLetters(letters);
        System.out.println(checkUpperLetters);

        // 162. Дана дата. Преобразовать в следующий массив

        String date = "2025-12-31";

        System.out.println("Вывод даты из 2025-12-31 в:");
        newFormatDateArr(date);

        // 163. Дана строка со словами. Сделайте заглавным первый символ каждого слова

        String word = "aaa, bbb, ccc";

        System.out.println("\nВывод слов с первой заглавной буквой");
        String modifiedWord = getAllCapitalLettersFromWords(word);
        System.out.print(modifiedWord + " ");

        // 164. Дан массив символов. Слейте эти символы в пары

        char[] chars = {'a', 'b', 'c', 'd'};

        String[] result = slivOfChars(chars);
        System.out.println("\nВывод слияния символов в пары");
        for (String pair : result) {
            System.out.print(pair + " ");
        }
    }
    // 1.
    public static boolean checkTwoUppersLetters(String str) {
        int countUpperChars = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toUpperCase(str.charAt(i)) > 2) {
                return false;
            }
        }
        return true;
    }
    // 2.
    public static void newFormatDateArr(String date) {
        String newDate = date.replaceAll("[-]", ", ");

        String[] arrDate = newDate.split(" ");

        for (int d = 0; d < arrDate.length; d++) {
            String  temp = arrDate[d];
            arrDate[d] = arrDate[arrDate.length - d - 1];
            arrDate[arrDate.length - d - 1] = temp;
        }
        for (String d : arrDate) {
            System.out.print(d + " ");
        }
    }
    // 3.
    public static String getAllCapitalLettersFromWords(String word) {
        String[] words = word.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
        String modifiedWords = String.join(" ", words);
        return modifiedWords;
    }
    // 5.
    public static String[] slivOfChars(char[] chars) {
        String[] result = new String[chars.length / 2];

        for (int i = 0; i < chars.length; i+=2) {
            result[i / 2] = "" + chars[i] + chars[i + 1];
        }
        return result;
    }
}
