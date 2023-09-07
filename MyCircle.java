class MyCircle {
    private double radius;

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(MyCircle otherCircle) {
        return this.radius == otherCircle.radius;
    }
}
