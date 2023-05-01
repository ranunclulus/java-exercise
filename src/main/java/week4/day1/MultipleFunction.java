package week4.day1;

public class MultipleFunction {
    public static void multiplication(int number){
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
    public static void main(String[] args) {
        multiplication(2);
    }
}
