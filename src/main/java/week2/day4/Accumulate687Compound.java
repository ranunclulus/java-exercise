package week2.day4;

public class Accumulate687Compound {
    public static void main(String[] args) {
        int num = 678;
        int answer = 0;
        
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;
        answer += num % 10;
        num /= 10;

        System.out.println("answer = " + answer);
    }
}
