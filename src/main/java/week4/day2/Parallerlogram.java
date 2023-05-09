package week4.day2;

public class Parallerlogram {
    private String spaceChar = "";
    public Parallerlogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeParallelogramLine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i), "*".repeat(height));
    }
    public static void main(String[] args) {
        int height = 4;
        Parallerlogram parallerlogram = new Parallerlogram(" ");
        for (int i = 0; i < height; i++) {
            System.out.println(parallerlogram.makeParallelogramLine(height, i));
        }

    }
}
