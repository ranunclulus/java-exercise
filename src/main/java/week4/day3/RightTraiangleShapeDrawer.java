package week4.day3;

public class RightTraiangleShapeDrawer extends ShapeDrawer2{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public static void main(String[] args) {
        RightTraiangleShapeDrawer rightTraiangleShapeDrawer = new RightTraiangleShapeDrawer();
        rightTraiangleShapeDrawer.printShape(5);
    }
}
