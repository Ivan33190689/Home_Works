package tasks;

import org.w3c.dom.ls.LSOutput;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Task8 implements Serializable {
    public static void main(String[] args) {
        // Отсортируйте сдоварь по значению в порядке возрастания и в порядке убывания.

        Map<String, LocalDate> dictionary = new HashMap<>();

        dictionary.put("Анна", LocalDate.of(1999, 7, 26));
        dictionary.put("Пётр", LocalDate.of(1992, 3, 15));
        dictionary.put("Мария", LocalDate.of(2006, 6, 20));
        dictionary.put("Иван", LocalDate.of(1984, 10, 4));
        dictionary.put("Елена", LocalDate.of(1996, 9, 3));

        // Сортировка словаря по значению.

        List<Map.Entry<String, LocalDate>> sortedList = new ArrayList<>(dictionary.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());

        System.out.println("Сортировка по значению в порядке возрастания\n");
        for (Map.Entry<String, LocalDate> entry : sortedList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        List<Map.Entry<String, LocalDate>> sortedListReverse = new ArrayList<>(dictionary.entrySet());
        sortedListReverse.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        System.out.println("\nСортировка словаря по значению в порядке убывания\n");

        for (Map.Entry<String, LocalDate> entryReverse : sortedListReverse) {
            System.out.println(entryReverse.getKey() + " : " + entryReverse.getValue());
        }
    }
}
