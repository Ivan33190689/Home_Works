import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretPinCode = 7564;
        int pinCode = -1;

        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.println("Введите PIN-код;");
            }else {
                System.out.println("Неверный PIN-код");
            }
            pinCode = new Scanner(System.in).nextInt();
        }
        System.out.println("PIN-код введён верно");
    }
}
