package CodeUp;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            result = sc.next() + " " + result;
        }

        System.out.println(result);
    }
}
