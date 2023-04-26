package CodeUp;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split("[ ]");
        int sum = Integer.parseInt(num[0]) + Integer.parseInt(num[1]) + Integer.parseInt(num[2]);
        System.out.printf("%d\n%.1f", sum, sum / 3.0);
    }
}
