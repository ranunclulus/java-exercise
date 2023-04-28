package CodeUp;

import java.util.Scanner;

public class CodeUp1065 {
    public static void oddEven(int iVal) {
        if (iVal % 2 == 0){
            System.out.println(iVal);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();
        oddEven(iVal1);
        oddEven(iVal2);
        oddEven(iVal3);
    }
}
