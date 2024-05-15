package HW6;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        
        phoneBook.addPhoneNumber("Сергей", 1234567);
        phoneBook.addPhoneNumber("Пётр", 4567890);
        phoneBook.addPhoneNumber("Сергей", 3579135);
        phoneBook.addPhoneNumber("Сергей", 1357975);
        phoneBook.addPhoneNumber("Ирина", 2468024);
        phoneBook.addPhoneNumber("Пётр", 3692581);

        phoneBook.printPhoneBook();
    }
}
