package tasks;

public class Task6 {
    public static void main(String[] args) {
        // Перевести целое число в строку, при том, что его можно применять в любой системе исчисления.

        int num = 77;
        int base = 25;

        String IntegertoString = convertToString(num, base);
        System.out.println(num + " в системе счисления, " + base + " в системе счисления");
    }
    public static String convertToString(int num, int base) {
        return Integer.toString(num, base);
    }
}
