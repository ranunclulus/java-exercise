package CodeUp;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt = 0;
        while (number > 0) {
            number = number / 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
