package lesson_7;

public class Main {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        // ООП:
        Car bmw = new Car(250.0f, 2500, "white", new byte[] {0, 0, 0}); // Создание обьекта.
        bmw.setLight(true);
        bmw.blinkLight();
//        bmw.engine.setValues(true, 10000);
//        bmw.engine.info(); // Вызов обьекта и метода вложенного класса.


        Truck truck = new Truck(5500, new byte[] {100, 0, 100});
        truck.engine.setValues(false, 2000000);
        truck.engine.info();


        // Создание анонимного класса.
        Car flyCar = new Car(250.0f, 2500, "white", new byte[] {0, 0, 0}) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("Машина летит");
            }
        };
        flyCar.moveObject(450.0f);
    }
}