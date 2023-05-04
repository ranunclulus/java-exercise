package CodeUp;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int x = 1;
        int y = 1;

        boolean find = false;
        for (int i = x; i < 10; i++) {
            for (int j = y; j < 10; j++) {
                if(map[i][j] == 0 && j >= y) {
                    map[i][j] = 9;
                    x = i;
                    y = j;
                }
                else if(map[i][j] == 1) {
                    x++;
                    break;
                }
                else {
                    x = i;
                    y = i;
                    map[i][j] = 9;
                    find = true;
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.println();
        }
    }
}
