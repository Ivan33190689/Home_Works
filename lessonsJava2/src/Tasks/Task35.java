package Tasks;

public class Task35 {
    public static void main(String[] args) {
        // 78. Дан массив с целыми числами. Выведите только те элементы, которые делятся на 5

        int[] array = {10, 23, 31, 30, 35, 75, 40, 15};

        System.out.println("Вывод всех элементов маасива, делящихся на 5");
        printArrayElOn5(array);

        // 79. Дана строка. Получить первых три символа этой строки

        String text = "abcdef";

        // Создаём массив символов
        char[] charArrayText = text.toCharArray();

        // Создаём StringBuilder
        StringBuilder sbr = new StringBuilder();

        sbr.append("\nВыводим первые три символа строки\n ");
        sbr.append(charArrayText[0]).append(charArrayText[1]).append(charArrayText[2]);

        System.out.println(sbr);

        // 80. Дан символ. Определить к какому регистру он относится
        char ch = 'a';

        System.out.println("Проверка символа на нижний регистр");
        System.out.println(Character.isLowerCase(ch));

        // 81. Дан массив. Получить срез этого массива

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Срез массива");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        // 82. Дан массив с целыми числами. Вывести позицию первого нуля

        int[] numArr = {1, 2, 3, 0, 5, 6, 0};

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0) {
                System.out.println("\n" + i + " позиция первого нуля в массиве");
                break;
            }
        }
        // 83. Дана строка. Заменить в ней дефисы на пробелы

        String st = "123-456-789";
        String[] stArray = st.split("-");

        StringBuilder sbld = new StringBuilder();

        System.out.println("Вывод строки через пробел");
        sbld.append(stArray[0]).append(" ").append(stArray[1]).append(" ").append(stArray[2]);
        System.out.println(sbld.toString());
    }

    public static void printArrayElOn5(int[] array) {

        // Проходимся по всем элементам и выводим те, что делятся на 5
        for (int elem : array) {
            if (elem % 5 == 0) System.out.print(elem + " ");
        }
    }
}

