package CodeUp;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementary = sc.nextInt();
        int middle = sc.nextInt();
        int high = sc.nextInt();
        for (int i = 1; i <= elementary * middle * high ; i++) {
            if (i % elementary == 0 && i % middle == 0 && i %high == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
