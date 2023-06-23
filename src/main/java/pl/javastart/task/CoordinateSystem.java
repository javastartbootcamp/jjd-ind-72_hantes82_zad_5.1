package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    final String firstQ = "I";
    final String secQ = "I";
    final String thirdQ = "I";
    final String fourthQ = "I";
    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.

    void run(Scanner scanner) {
        System.out.println("Podaj wspolrzędna x punktu:");
        int x = scanner.nextInt();
        System.out.println("Podaj wspolrzędna y punktu:");
        int y = scanner.nextInt();
        Point point = new Point(x, y);
        if (x > 0 && y > 0) {
            System.out.println(point.toString() + point.quarterDisplay(firstQ));
        } else if (x < 0 && y > 0) {
            System.out.println(point.toString() + point.quarterDisplay(secQ));
        } else if (x < 0 && y < 0) {
            System.out.println(point.toString() + point.quarterDisplay(thirdQ));
        } else if (x > 0 && y < 0) {
            System.out.println(point.toString() + point.quarterDisplay(fourthQ));
        } else if (x == 0 && y == 0) {
            System.out.println(point.toString() + " leży na środku układu współrzędnych");
        } else if (x == 0 && y != 0) {
            System.out.println(point.toString() + " leży na osi Y");
        } else if (x != 0 && y == 0) {
            System.out.println(point.toString() + " leży na osi X");
        }
    }
}
