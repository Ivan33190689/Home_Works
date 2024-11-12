package lesson_3;

public class Main {
    public static void main(String[] args) {
        Dog uma = new Dog("Ума", 9, "red");
        uma.overload();
        uma.overload("Умф");

        System.out.println(uma);

    }
}
