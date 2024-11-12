package Tasks;

public class Task46 {
    public static void main(String[] args) {
        // 128. Дана строка с буквами и цифрами. Получить позицию первой цифры в строке

        String lettersAndDigits = "ab3cd576f8";
        int firstIndexOfDigit = 0;

        for (int i = 0; i < lettersAndDigits.length(); i++) {
            if (Character.isDigit(lettersAndDigits.charAt(i))) {
                firstIndexOfDigit = i;
                break;
            }
        }
        System.out.println(firstIndexOfDigit + " индекс первой цифры в строке");

        // 129. Напишите программу, которая сформирует строку "xxxxx"

        String strX = "";

        System.out.println("вывод строки в формате " + "xxxxx");
        for (int i = 1; i <= 5; i++) {
            strX += "x";
        }
        System.out.println(strX);

        // 130. Дан массив. Удалить из него все нули и вывести результат в новый массив

        int[] array = {1, 0, 2, 0, 3, 0, 4, 0, 5};

        int[] delZero = deleteZero(array);

        System.out.println("Вывод массива без нулей");
        for (int num : delZero) {
            System.out.print(num + " ");
        }


    }
    public static int[] deleteZero(int[] array) {
        int count = 0;

        for (int num : array) {
            if (num == 0) continue;
            count++;
        }
        int[] result = new int[count];
        int index = 0;

        for (int num : array) {
            if (num != 0) {
                result[index++] += num;
            }
        }
        return result;
    }
}
