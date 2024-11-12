package Tasks;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class Task43 {
    public static void main(String[] args) {
        // 114. Дана строка. Наёти позицию третьего нуля в строке

        String strNums = "12034056070890";
        int thirdZeroIndex = strNums.indexOf("0", strNums.indexOf("0") + strNums.indexOf("0") + strNums.indexOf("0"));

        System.out.println(thirdZeroIndex + " позиция третьего нуля в строке");

        // 115. Дана строка с числами через запятую. Найти самое больщое число

        String str = "1, 2, 10, 100, 3";

        String[] strArr = str.split(", ");

        int max = Integer.parseInt(strArr[0]);

        System.out.println("Максимальное число в строке");
        for (String number : strArr) {
            int num = Integer.parseInt(number.trim());
            if (max < num) {
                max = num;
            }
        }
        System.out.println("max = " + max);

        // 116. Дана строка. Преобразоваеть строку в массив символов

        String strLetters = "abcdef";
        char[]charArr = strLetters.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Вывод символов строки").append("\n");

        for (char ch : charArr) {
            stringBuilder.append(ch).append(", ");
        }
        System.out.println(stringBuilder);

        // 117. Дана строка в формате kebab-case. Преобразовать в snake_case

        String kebabCase = "kebab-case";

        StringBuilder snakeCase = new StringBuilder();
        boolean addUnderScore = false;

        System.out.println("Вывод строки в формате snake_case");
        for (int i = 0; i < kebabCase.length(); i++) {
            char c = kebabCase.charAt(i);
            if (c == '-') {
                addUnderScore = true;
            }else {
                if (addUnderScore) {
                    snakeCase.append('_');
                    addUnderScore = false;
                }else {
                    snakeCase.append(c);
                }
            }
        }
        System.out.println(snakeCase);

        // 118. Дана строка в фрмате snake_case. Преобразовать в camelCase

        String snake = "snake_case";
        boolean iscapitalize = false;
        StringBuilder camelCase = new StringBuilder();

        System.out.println("Вывод строки в формать camelCase");
        for (int i = 0; i < snake.length(); i++) {
            char c = snake.charAt(i);
            if (c == '_') {
                iscapitalize = true;
            }else {
                if (iscapitalize) {
                    camelCase.append(Character.toUpperCase(c));
                    iscapitalize = false;
                }else {
                    camelCase.append(c);
                }
            }
        }
        System.out.println(camelCase);

        // 119. Дана строка camelCase. Преобразуйте её в строку snake_сase

        String camelCaase = "camelCase";
        boolean isLower = false;
        StringBuilder snCase = new StringBuilder();

        System.out.println("Вывод строки в формате snake_case");
        for (int i = 0; i < camelCaase.length(); i++) {
            char c = camelCaase.charAt(i);
            if (c == 'C') {
                isLower = true;
            }else {
                if (isLower) {
                    snCase.append('_');
                    isLower = false;
                }else {
                    snCase.append(c);
                }
            }
        }
        System.out.println(snCase);
    }
}
