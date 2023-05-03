package CodeUp;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] call = new int[24];
        for (int i = 0; i < number; i++) {
            call[sc.nextInt()] += 1;
        }
        for (int i = 0; i < number; i++) {
            if(call[i] != 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
