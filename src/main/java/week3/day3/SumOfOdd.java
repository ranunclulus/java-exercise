package week3.day3;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i +=2) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
