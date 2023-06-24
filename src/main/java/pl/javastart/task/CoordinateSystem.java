package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.

    void run(Scanner scanner) {
        System.out.println("Podaj współrzędna x punktu:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj współrzędna x punktu:");
        int y = scanner.nextInt();
        scanner.nextLine();
        Point point = new Point(x, y);
        if (x > 0 && y > 0) {
            System.out.println(point.toString() + quarterDisplay("I"));
        } else if (x < 0 && y > 0) {
            System.out.println(point.toString() + quarterDisplay("II"));
        } else if (x < 0 && y < 0) {
            System.out.println(point.toString() + quarterDisplay("III"));
        } else if (x > 0 && y < 0) {
            System.out.println(point.toString() + quarterDisplay("IV"));
        } else if (x == 0 && y == 0) {
            System.out.println(point.toString() + " leży na środku układu współrzędnych");
        } else if (x == 0 && y != 0) {
            System.out.println(point.toString() + " leży na osi Y");
        } else if (x != 0 && y == 0) {
            System.out.println(point.toString() + " leży na osi X");
        }
    }

    public String quarterDisplay(String quarter) {
        return " leży w " + quarter + " ćwiartce układu współrzędnych";
    }
}
