package CodeUp;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        for (int i = 1; i <= iVal1; i++) {
            for(int j = 1; j <= iVal2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
