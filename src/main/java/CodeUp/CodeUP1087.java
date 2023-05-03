package CodeUp;

import java.util.Scanner;

public class CodeUP1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= iVal; i++) {
            if(sum >= iVal) {
                break;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
