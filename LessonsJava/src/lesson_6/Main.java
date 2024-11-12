package lesson_6;

public class Main {
    public static void main(String[] args) {
        // Методы
//        info("Hello");
//        String java = "java";
//        info(java);
//        info(null);

        short num = 7;
        int result2 = summa((short) 4, num);

        info(String.valueOf(result2));
    }
    public static int summa(short a, short b) {
        int res = a + b;
        String result = "Результат: " + res;
        info(result);

        return  res;
    }
    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}
