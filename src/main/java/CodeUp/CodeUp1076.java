package CodeUp;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        for(char c = 'a'; c <= input; c++){
            System.out.printf("%c ", c);
        }
    }
}
