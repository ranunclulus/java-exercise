package CodeUp;

import java.util.Scanner;

public class CodeUp1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        boolean twoNumOne = (iVal1 == iVal2);
        System.out.println(twoNumOne? 1 : 0);
    }
}
