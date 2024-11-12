package lesson_7;

public class Car extends Transport implements ILights{
    boolean isOn;
    // Создание обьекта из вложенного класса.
    public Engine engine = new Engine();

    public Car(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Обьект движется со скоростью: " + speed + "\t" + "км/ч");
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы начинаем моргать!");
    }
}
