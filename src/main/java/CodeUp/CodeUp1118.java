package CodeUp;

import java.util.Scanner;

public class CodeUp1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        System.out.printf("%.1f", height * width / 2.0);
    }
}
