package week2.day5;

public class IfWrong {
    public static void main(String[] args) {
        int score = 81;
        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }
    }
}
