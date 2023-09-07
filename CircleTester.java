public class CircleTester {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(5.0);
        MyCircle circle2 = new MyCircle(7.5);

        System.out.println("Circle 1: Radius = " + circle1.getRadius());
        System.out.println("Area of Circle 1: " + circle1.calculateArea());
        System.out.println("Circumference of Circle 1: " + circle1.calculateCircumference());

        System.out.println("\nCircle 2: Radius = " + circle2.getRadius());
        System.out.println("Area of Circle 2: " + circle2.calculateArea());
        System.out.println("Circumference of Circle 2: " + circle2.calculateCircumference());

        if (circle1.equals(circle2)) {
            System.out.println("\nCircle 1 and 2 have the same radius.");
        } else {
            System.out.println("\nCircle 1 and 2 have different radii.");
        }
    }
}






