package CodeUp;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("[:]");
        System.out.printf("%d", Integer.parseInt(date[1]));
    }
}
