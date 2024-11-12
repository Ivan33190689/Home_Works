package Tasks;

public class Task41 {
    public static void main(String[] args) {
        // 108. Дана строка. Получить последнюю заглавную букву каждого слова строки

        String str = "the quick brown fox jumps ower the lazy dog";
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        System.out.println("Вывод слов, заканчиваюшихся на Заглавную букву");
        for (String word : words) {
            String modifiedWord = word.substring(0, word.length() - 1) + Character.toUpperCase(word.charAt(word.length() - 1));
            result.append(modifiedWord).append(" ");
        }
        System.out.print(result);

        // 109. Дана строка. Проверить, что строка состоит из чётных цифр

        String string = "2468";
        boolean isEvenNumbers = true;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) % 2 != 0) isEvenNumbers = false;
        }
        if (isEvenNumbers) {
            System.out.println("\nВсе цифры в числе чётные");
        }else {
            System.out.println("\nНе все цифры в числе чётные");
        }
        // 110. Дан массив с дробными числами. Округлить до первой дробной цифры.

        double[] numbers = {1.456, 2.125, 3.32, 4.1, 5.34};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(numbers[i] * 10.0) / 10.0;
        }
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        // 111. Даны целые числа, разделённые запятыми. Найти сумму этих чисел

        String strNumbers = "12, 34, 56";
        String[] arrayNums = strNumbers.split(", ");
        int summa = 0;

        System.out.println("\nВывод суммы чисел строки");
        for (String number : arrayNums) {
            int num = Integer.parseInt(number.trim());
            summa += num;
        }
        System.out.println(summa);

        // 112. Дано целое число. Удалить из числа все нечётные цифры

        int element = 123789;
        String stringNumber = String.valueOf(element);

        System.out.println("Вывод чётных цифр числа");
        for (int i = 0; i < stringNumber.length(); i++) {
            int digit = Character.getNumericValue(stringNumber.charAt(i));
            if (digit % 2 == 0) System.out.print(digit);
        }
    }
}
