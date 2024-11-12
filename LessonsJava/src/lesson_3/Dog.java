package lesson_3;

public class Dog extends Animal {
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Вуф, вуф!");
    }
    public  void overload() {
        System.out.println("Empty");
    }
    public  void overload(String name) {
        System.out.println("Имя: " + name);
    }
}
