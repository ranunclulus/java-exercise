package CodeUp;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] birthday = sc.next().split("[.]");
        System.out.printf("%s-%s-%s", birthday[2], birthday[1], birthday[0]);
    }
}
