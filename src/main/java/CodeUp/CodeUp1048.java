package CodeUp;

import java.util.Scanner;

public class CodeUp1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        int mul = sc.nextInt();
        if (mul == 0) {
            System.out.println(iNum);
        }
        else {
            System.out.println(iNum * (2 << (mul - 1)));
        }
    }
}
