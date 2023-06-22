package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        System.out.println("Podaj wspolrzędna x punktu:");
        int x = scanner.nextInt();
        System.out.println("Podaj wspolrzędna y punktu:");
        int y = scanner.nextInt();
        Point point = new Point(x, y);
        if (x < 0 && y > 0) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w II ćwiartce układu współrzędnych");
        } else if (x > 0 && y > 0) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w I ćwiartce układu współrzędnych");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w III ćwiartce układu współrzędnych");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w IV ćwiartce układu współrzędnych");
        } else if (x == 0 && y == 0) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży na środku układu współrzędnych");
        } else if (x == 0 && y != 0) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży na osi Y");
        } else if (x != 0 && y == 0) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży na osi X");
        }
    }
}
