package CodeUp;

import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        String xVal = Integer.toString(iVal, 16);
        System.out.println(xVal.toUpperCase());
    }

}
