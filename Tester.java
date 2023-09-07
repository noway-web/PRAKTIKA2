// Класс Tester для тестирования
public class Tester {
    public static void main(String[] args) {
        // Создаем несколько объектов класса Point
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(3.0, 4.0);

        // Создаем объекты класса Circle, используя точки в качестве центров и радиусы
        Circle circle1 = new Circle(point1, 5.0);
        Circle circle2 = new Circle(point2, 3.0);

        // Создаем массив объектов Circle
        Circle[] circles = {circle1, circle2};

        // Выводим информацию о кругах
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Circle " + (i + 1) + ":");
            System.out.println("Center: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Radius: " + circles[i].getRadius());
            System.out.println();
        }

        // Выводим количество элементов в массиве
        System.out.println("Number of circles: " + circles.length);
    }
}