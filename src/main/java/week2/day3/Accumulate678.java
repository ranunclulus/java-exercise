package week2.day3;

public class Accumulate678 {
    public static void main(String[] args) {
        int num = 678;
        int answer = 0;
        // 반드시 나머지를 먼저 구하고 그 뒤에 몫을 구해야 함
        answer = answer + (num % 10);
        num = num / 10;
        System.out.println("answer = " + answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.println("answer = " + answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.println("answer = " + answer);
    }
}
