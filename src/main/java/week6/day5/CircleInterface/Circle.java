package week6.day5.CircleInterface;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (radius * radius * 3.14);
    }

    @Override
    public double calculaterPerimeter() {
        return (2 * radius * 3.14);
    }
}
