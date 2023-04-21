package week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 100;
        p1.y = 100;
        System.out.printf("x: %d, y: %d\n", p1.x, p1.y);
        System.out.println(p1.isSameXy());

        Point p2 = new Point();
        p2.x = 200;
        p2.y = 200;
        System.out.printf("x: %d, y: %d\n", p2.x, p2.y);
        System.out.println(p2.isSameXy());
    }
}
