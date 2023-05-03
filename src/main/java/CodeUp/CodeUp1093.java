package CodeUp;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] count = new int[23];
        for (int i = 0; i < number; i++) {
            count[sc.nextInt() - 1] += 1;
        }
        for (int i = 0; i < 23; i++) {
            System.out.printf("%d ", count[i]);
        }
    }
}
