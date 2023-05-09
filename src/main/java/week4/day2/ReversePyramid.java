package week4.day2;

public class ReversePyramid {
    private String spaceChar = "";
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(height + 3 - (i * 2)));
    }
    public static void main(String[] args) {
        int height = 4;
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        for (int i = 0; i < height; i++) {
            System.out.println(reversePyramid.makeALine(height, i));
        }
        ReversePyramid reversePyramidZero = new ReversePyramid("0");
        for (int i = 0; i < height; i++) {
            System.out.println(reversePyramidZero.makeALine(height, i));
        }
    }
}
