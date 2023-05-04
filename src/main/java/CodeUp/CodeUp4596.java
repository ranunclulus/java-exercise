package CodeUp;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int targetValue = arr[0][0];
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(targetValue < arr[i][j]) {
                    maxX = i;
                    maxY = j;
                    targetValue = arr[i][j];
                }
            }
        }
        System.out.println(targetValue);
        System.out.printf("%d %d", maxX + 1, maxY + 1);
    }
}
