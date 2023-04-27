package CodeUp;

import java.util.Scanner;

public class CodeUp1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("[ ]");
        System.out.println(Integer.parseInt(str[0]) == Integer.parseInt(str[1]) ? 1 : 0);
    }
}
