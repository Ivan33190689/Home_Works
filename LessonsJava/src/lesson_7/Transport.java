package lesson_7;

import java.awt.color.ICC_ColorSpace;

public abstract class Transport {
    protected   float speed;
    private int weight;
    private  String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate){
        this.setValues(speed, weight, color, coordinate);
    }
    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
    }
    public abstract void moveObject(float speed);
    public abstract boolean stopObject();


    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    protected String getValues() {
        String info = "Object speed: " + speed + ", weight: " + weight + ", color: " + color + "." + "\n";
        String infoCoordinates = "Coordinates:\n";

        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }
    // Вложенный класс
    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }
        public void  isReady(boolean isReady) {
            this.isReady = isReady;
        }
        public void info() {
            if(isReady) {
                System.out.println("Двигатель исправен");
            }else {
                System.out.println("Двигатель не работает: " + km + "\t" + "км");
            }
        }
    }
}
