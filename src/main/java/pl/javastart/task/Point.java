package pl.javastart.task;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Punkt + x + y ";
    }

    public String quarterDisplay(String quarter) {
        return " leży w " + quarter + " ćwiartce układu współrzędnych";
    }
}
