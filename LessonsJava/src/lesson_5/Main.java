package lesson_5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Коллекции данных!

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50); // Добавление элемента
        numbers.add(1, 30); // Добавление элемента по индексу
        System.out.println(numbers.get(2)); // Получение элемента по индексу
        System.out.println(numbers.size()); // Размер листа
        numbers.remove(1); // Удаление элемента
        numbers.clear(); // Удаление всего листа


        for (Integer el : numbers) {
            System.out.println(el);
        }
        LinkedList<Float> nums = new LinkedList<>(); // Все теже операции
    }
}
