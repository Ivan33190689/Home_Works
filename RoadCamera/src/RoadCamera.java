import java.util.Scanner;

public class RoadCamera {
    public static void main(String[] args) {
        // Parameters

        int maxOncommingSpeed = 30; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 500; // RUB
        int criminalSpeed = 180; // km/h

        System.out.print("Введите скорость: ");
        int oncomingSpeed = new Scanner(System.in).nextInt();

        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Вызов полиции ...");
        }else if (oncomingSpeed > maxOncommingSpeed){
            int overSpeed = oncomingSpeed - maxOncommingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штраф: " + fine + " руб.");
        }else {
            System.out.println("Скорость не превышена");
        }
    }
}
