package Tasks;

public class Task40 {
    public static void main(String[] args) {

        // 102. Дан массив с целыми числами. Вывести в консоль числа, имеющие более трёх знаков

        int[] arr = {103, 101, 26, 314, 12, 2024, 13082024, 35};

        System.out.println("Вывод чисел из массива, имеющих более трёх цифр");
        for (int num : arr) {
            if (num > 999) {
                System.out.print(num + " ");
            }
        }
        // 103. Дан массив. Выведите каждый пятый его элемент

        int[] array = {1, 2, 3, 4, 5, 7, 10, 5, 16, 15};

        System.out.println("\nВывод в консоль каждого пятого элемента массива");
        for (int i = 4; i < array.length; i+=5) {
            System.out.print(array[i] + " ");
        }
        // 104. Дан массив строк. Оставьте только те строки, которые заканчиваются на html

        String[] strArr = {"text.html", "java", "document.html", "file", "system", "doc.html"};

        System.out.println("\nВывод строк, заканчивающихся на html");
        for (String str : strArr){
            if (str.endsWith("html")) {
                System.out.print(str + " ");
            }
        }
        // 105. Дано число. Проверьте, что все цифры этого числа больше 0

        int number = 12345;

        checkOfNumberOnPositiveDigits(number);

        // 106. Даны три массива. Объединить их в один массив

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};
        int totalLength = arr1.length + arr2.length + arr3.length;

        int[] combined = new int[totalLength];
        int index = 0;

        for (int n : arr1) {
            combined[index++] = n;
        }
        for (int n : arr2) {
            combined[index++] = n;
        }
        for (int n : arr3) {
            combined[index++] = n;
        }
        System.out.println("\nВывод объединённого массива");
        for (int n : combined){
            System.out.print(n + " ");
        }
        // 107. Дано число. Сделайте строку, содержащую столько нулей, какое указано в переменной

        int countZeros = 5;
        String zeros = "";

        System.out.println("Вывод нулей по переменной");
        for (int i = 0; i < countZeros; i++) {
            zeros += "0";
        }
        System.out.print("\n" + zeros);

    }
    public static void checkOfNumberOnPositiveDigits(int num) {
        String strNums = String.valueOf(num);
        boolean isPositiveDigit = true;

        for (int i = 0; i < strNums.length(); i++) {
            if (strNums.charAt(i) <= '0') {
                isPositiveDigit = false;
            }
        }
        if (!isPositiveDigit) {
            System.out.println("\nНе все цифры в числе больше нуля ");
        }else {
            System.out.println("\nВсе цифры числа больше 0");
        }
    }
}
