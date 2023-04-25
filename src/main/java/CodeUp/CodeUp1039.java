package CodeUp;

import java.util.Scanner;

public class CodeUp1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("[ ]");
        long Num1 = Long.parseLong(str[0]);
        long Num2 = Long.parseLong(str[1]);
        System.out.printf("%d", Num1 + Num2);

    }
}
