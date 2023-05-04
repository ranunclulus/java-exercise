package CodeUp;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int[][] arr = new int [width][height];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            int direction = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (direction == 0) {
                for (int j = 0; j < length; j++) {
                    arr[x - 1][y + j - 1] = 1;
                }
            }
            else {
                for (int j = 0; j < length; j++) {
                    arr[x + j - 1][y - 1] = 1;
                }
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}
