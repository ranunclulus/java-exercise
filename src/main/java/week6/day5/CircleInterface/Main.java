package week6.day5.CircleInterface;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculaterPerimeter());

        Shape rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculaterPerimeter());
    }
}
