package lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");

        String name = sc.nextLine();

        System.out.print("Введите вашу фамилию: ");
        
        String secondName = sc.nextLine();
        Person person3 = new Person(name, secondName);
        person3.printName(name, secondName);

//        Person person1 = new Person("Иван", 35);
//        Person person2 = new Person("Алексей");
//
//        System.out.println(person1);
//        System.out.println(person2);

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите ваше имя: ");
//        String name = scan.nextLine();
//        System.out.println("Привет, " + name + "!");
    }
}
