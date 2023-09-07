// Класс TestBall для тестирования класса Ball
public class TestBall {
    public static void main(String[] args) {
        // Создаем объект класса Ball
        Ball ball = new Ball(0, 0, 2, 3);

        // Выводим информацию о мяче
        System.out.println(ball);

        // Двигаем мяч
        ball.move();

        // Выводим обновленную информацию о мяче
        System.out.println(ball);
    }
}