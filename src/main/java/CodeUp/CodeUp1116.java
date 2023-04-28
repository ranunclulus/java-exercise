package CodeUp;

import java.util.Scanner;

public class CodeUp1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        System.out.printf("%d+%d=%d\n", iVal1, iVal2, iVal1 + iVal2);
        System.out.printf("%d-%d=%d\n", iVal1, iVal2, iVal1 - iVal2);
        System.out.printf("%d*%d=%d\n", iVal1, iVal2, iVal1 * iVal2);
        System.out.printf("%d/%d=%d\n", iVal1, iVal2, iVal1 / iVal2);

    }
}
