package CodeUp;

import java.util.Scanner;

public class CodeUp1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for (int i = 1; i <= iVal ; i++) {
            if (iVal % i == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
