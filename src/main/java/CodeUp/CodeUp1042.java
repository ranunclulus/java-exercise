package CodeUp;

import java.util.Scanner;

public class CodeUp1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split("[ ]");
        System.out.printf("%d", Integer.parseInt(num[0]) / Integer.parseInt(num[1]));
    }
}
