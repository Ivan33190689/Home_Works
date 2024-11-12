package lesson_4;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        System.out.println(plane);

        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        System.out.println(butterfly);
    }
}
