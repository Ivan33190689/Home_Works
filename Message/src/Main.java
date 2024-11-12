public class Main {
    public static void main(String[] args) {
        String input = "Привет";

        switch (input) {
            case "Привет" -> System.out.println("Привет:)");
            case "Как дела?" -> {
                System.out.println("Отлично!");
                System.out.println("Как у тебя?");
            }
            default -> System.out.println("Непонятное мне сообщение");
        }
    }
}
