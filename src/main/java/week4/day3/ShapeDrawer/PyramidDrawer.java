package week4.day3.ShapeDrawer;

public class PyramidDrawer implements ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s", " ".repeat(h - i), "*".repeat(2 * i - 1));
    }
}
