public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;
        boolean isPersonal = true;

        String massage;
//        String massage = passIsValid && !inCarantine ? "Вход открыт" : "Вход закрыт";

        if (passIsValid && !inCarantine) {
            massage = "Проход открыт";
        }else if (isPersonal) {
            massage = "Проход открыт только для персонала";
        }else {
            massage = "Проход закрыт";
        }
    }
}
