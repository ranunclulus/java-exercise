package week4.day3.ShapeDrawer;

public class DrawStar {
    ShapeDrawer shapeDrawer;
    public DrawStar(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void printShape(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s\n", this.shapeDrawer.makeALine(h, i));
        }
    }
    public static void main(String[] args) {
        DrawStar pyramid = new DrawStar(new PyramidDrawer());
        pyramid.printShape(8);
        DrawStar triangle = new DrawStar(new TriangleDrawer());
        triangle.printShape(8);
    }
}
