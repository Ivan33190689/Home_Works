public class Arithmetic {
    private int number1;
    private int number2;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getSum() {
        return number1 + number2;
    }

    public int getMultiplication() {
        return number1 * number2;
    }

    public int getMaxNumber() {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }

    public int getMinNumber() {
        if (number1 < number2) {
            return number1;
        }
       return number2;
    }
}
