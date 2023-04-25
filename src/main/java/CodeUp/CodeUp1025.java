package CodeUp;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.printf("[%d]\n",Integer.parseInt(str.substring(0, 1)) * 10000);
        System.out.printf("[%d]\n",Integer.parseInt(str.substring(1, 2)) * 1000);
        System.out.printf("[%d]\n",Integer.parseInt(str.substring(2, 3)) * 100);
        System.out.printf("[%d]\n",Integer.parseInt(str.substring(3, 4)) * 10);
        System.out.printf("[%d]",Integer.parseInt(str.substring(4, 5)));
    }
}
