package week4.day3.ShapeDrawer;

public class TriangleDrawer implements ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s", "*".repeat(i));
    }
}
