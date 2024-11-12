package Tasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Task81 {
    public static void main(String[] args) {
        // 279. Создать метод, который параметром будет принимать секунды, а возврашать количество дней по секундам

        long seconds = 172800;

        long days = getDaysToSeconds(seconds);
        System.out.println("Количество дней по секундам составляет " + days + " дней");

        // 280. Создать метод, который будет принимать дату в формате год, месяц, день и проверять дата ли это

        String date = "2000-10-25";

        boolean checkDate = checkDate(date);

        System.out.println("Проверка на верное указание даты");
        if (checkDate) {
            System.out.println("Введена дата");
        }else {
            System.out.println("Это не дата");
        }

        // 281. Создать метод, который сгенерирует строку с заданной длиной, заполненную случайными латинскими буквами

        System.out.println("Вывод строки с латинскими буквами");
        String letters = printStringLetters();
        System.out.println(letters);

        // 282. Создать метод, который будет принимать параметром строку со словами, а возвращать строку с заглавными первыми буквами

        String words = "java, python, c#, c++";

        String firstUpperLetter = printFirstSymbolToUpper(words);
        System.out.println(firstUpperLetter);

        // 283. Создать метод, который параметром будет принимать массив чисел, а возвращать массив делителеё каждого числа

        int[] numbers = {24, 80, 9};

        List<int[]> result = replaceWithDivisors(numbers);

        for (int i = 0; i < result.size(); i++) {
            System.out.println("Делители " + numbers[i] + ": " + Arrays.toString(result.get(i)));
        }
    }
    // 1.
    public static long getDaysToSeconds(long seconds) {
        return TimeUnit.SECONDS.toDays(seconds);
    }
    // 2.
    public static boolean checkDate(String date) {
        String formatter = "yyyy-MM-dd";

        SimpleDateFormat sdf = new SimpleDateFormat(formatter);

        sdf.setLenient(false);

        try {
            Date date1 = sdf.parse(date);
            return true;
        }catch (ParseException e) {
            return false;
        }
    }
    // 3.
    public static String printStringLetters() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину строки: ");
        int size = scanner.nextInt();

        final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            int index = rand.nextInt(LETTERS.length());
            sb.append(LETTERS.charAt(index));
        }
        return sb.toString();
    }
    // 4.
    public static String printFirstSymbolToUpper(String words) {
        String[] wordsArr = words.split(" ");
        StringBuilder sb = new StringBuilder();

        System.out.println("");
        for (String word : wordsArr) {
            sb.append(Character.toUpperCase(word.charAt(0)));
        }
        return sb.toString();
    }
    // 5.
    public static List<int[]> replaceWithDivisors(int[] numbers) {
        List<int[]> divisorsList = new ArrayList<>();

        for (int number : numbers) {
            divisorsList.add(getDivisor(number));
        }
        return divisorsList;
    }
    private static int[] getDivisor(int number) {
        List<Integer> divisor = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisor.add(i);
            }
        }
        return divisor.stream().mapToInt(i -> i).toArray();
    }
}
