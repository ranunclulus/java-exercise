package week2.day4;

public class OrExample {
    public static void main(String[] args) {
        int yearsOfExp = 8;
        int numofProj = 12;
        boolean isPromotion = yearsOfExp > 5 || numofProj > 10;
        System.out.printf("팀장 승진 여부: %b", isPromotion);
    }
}
