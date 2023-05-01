package CodeUp;

import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("[ ]");
        for (int i = 0; i < str.length; i ++){
            int value = Integer.parseInt(str[i]);
            if (value == 0) {
                break;
            }
            else {
                System.out.println(str[i]);
            }
        }
    }
}
