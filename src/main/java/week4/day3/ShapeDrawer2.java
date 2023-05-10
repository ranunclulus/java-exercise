package week4.day3;

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int h, int i);
    public void printShape(int h) {

        for (int i = 1; i <= h; i++) {
            System.out.printf("%s\n", makeALine(h, i));
        }
    }
}
