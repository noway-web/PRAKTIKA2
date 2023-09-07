
// Класс Ball, соответствующий диаграмме класса UML
public class Ball {
    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;

    // Конструктор для инициализации полей
    public Ball(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Геттер для x-координаты мяча
    public double getX() {
        return x;
    }

    // Геттер для y-координаты мяча
    public double getY() {
        return y;
    }

    // Геттер для x-скорости мяча
    public double getXSpeed() {
        return xSpeed;
    }

    // Геттер для y-скорости мяча
    public double getYSpeed() {
        return ySpeed;
    }

    // Метод для изменения координат мяча на следующий шаг
    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    // Метод для вывода информации о мяче
    @Override
    public String toString() {
        return "Ball[x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }
}