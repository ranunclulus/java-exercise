package week2.day3;

public class Remainder587Sum {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10;
        num = num / 10;
        int secondRemainder = num % 10;
        num = num /10;
        int thirdRemainder = num % 10;
        System.out.printf("%d", firstRemainder + secondRemainder + thirdRemainder);
    }
}
