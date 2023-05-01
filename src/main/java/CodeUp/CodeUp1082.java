package CodeUp;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ival = sc.nextInt(16);
        for (int i = 1; i < 16; i++) {
            System.out.printf("%s*%s=%s\n",
                    Integer.toHexString(ival).toUpperCase(),
                    Integer.toHexString(i).toUpperCase(),
                    Integer.toHexString(i * ival).toUpperCase());
        }
    }
}
