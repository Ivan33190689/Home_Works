public class Main {
    public static void main(String[] args) {
        Arithmetic numbers = new Arithmetic(2, 4);

        System.out.println("Сумма: " + numbers.getSum());
        System.out.println("Произведение: " + numbers.getMultiplication());
        System.out.println("Наибольшее число: " + numbers.getMaxNumber());
        System.out.println("Наименьшее число: " + numbers.getMinNumber());
    }
}
