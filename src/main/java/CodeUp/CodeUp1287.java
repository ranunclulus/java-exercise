package CodeUp;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            int m = n * i;
            for (int j = 0; j < m; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
