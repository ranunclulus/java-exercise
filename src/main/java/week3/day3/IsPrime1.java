package week3.day3;

public class IsPrime1 {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
