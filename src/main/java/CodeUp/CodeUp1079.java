package CodeUp;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("[ ]");
        for(int i = 0; i < str.length; i++) {
            if (str[i].charAt(0) == 'q'){
                System.out.println(str[i]);
                break;
            }
            else {
                System.out.println(str[i]);
            }
        }
    }
}
