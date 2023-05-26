package week6.day5.CircleInterface;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (height * width);
    }

    @Override
    public double calculaterPerimeter() {
        return (2 * (height + width));
    }
}
