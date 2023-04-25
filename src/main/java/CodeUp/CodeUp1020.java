package CodeUp;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] privateNum = sc.next().split("[-]");
        System.out.printf("%s%s", privateNum[0], privateNum[1]);
    }
}
