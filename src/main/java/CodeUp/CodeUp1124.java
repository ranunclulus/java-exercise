package CodeUp;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sVal = sc.next();
        int index = sVal.indexOf("H");
        System.out.printf("%d",
                Integer.parseInt(sVal.substring(1, index)) * 12 +
                Integer.parseInt(sVal.substring(index + 1)));
    }
}
