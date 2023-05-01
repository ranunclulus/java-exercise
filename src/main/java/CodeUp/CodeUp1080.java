package CodeUp;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            sum += i;
            if (sum >= number) {
                System.out.println(i);
                break;
            }
        }
    }
}
