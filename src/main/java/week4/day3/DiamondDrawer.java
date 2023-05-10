package week4.day3;

public class DiamondDrawer extends ShapeDrawer2 {
    @Override
    public String makeALine(int h, int i) {

        return String.format("%s%s", " ".repeat(h - i), "*".repeat(2 * i - 1));
    }
    public void printShape() {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s\n", makeALine(h, i));
        }
    }

    public static void main(String[] args) {
        DiamondDrawer rtd = new DiamondDrawer(); // Instance 생성
        rtd.printShape(); // 호출
    }
}