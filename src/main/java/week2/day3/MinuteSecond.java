package week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds / 60;
        int remainSeconds = seconds % 60;
        System.out.printf("%d분 %d초", minute, remainSeconds);
    }
}
