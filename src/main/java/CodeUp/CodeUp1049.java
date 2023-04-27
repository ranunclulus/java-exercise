package CodeUp;

import java.util.Scanner;

public class CodeUp1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("[ ]");
        int iVal1 = Integer.parseInt(str[0]);
        int iVal2 = Integer.parseInt(str[1]);
        System.out.println(iVal1 > iVal2 ? 1 : 0);
    }
}
