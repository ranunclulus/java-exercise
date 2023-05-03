package CodeUp;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < iVal ; i++) {
            if (iVal % i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime? "prime" : "not prime");
    }
}
