package Tasks;

import java.time.LocalDateTime;
import java.util.Locale;

public class Task00 {
    public static void main(String[] args) {
        // Вывод даты и времени

        System.out.println("Время и дата");
        LocalDateTime ldt = printDateandTime();
        System.out.println(ldt);
    }
    public static LocalDateTime printDateandTime() {
        return LocalDateTime.now();
    }
}
