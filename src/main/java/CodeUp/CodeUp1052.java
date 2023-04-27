package CodeUp;

import java.util.Scanner;

public class CodeUp1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("[ ]");
        System.out.println(Long.parseLong(str[0]) == Long.parseLong(str[1]) ? 0 : 1);
    }
}
