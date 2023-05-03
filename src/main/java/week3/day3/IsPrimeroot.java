package week3.day3;

import java.util.Scanner;

public class IsPrimeroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i * i <= iVal; i++) {
            if(iVal % i == 0) {
                isprime = false;
            }
        }
        System.out.println(isprime? "prime" : "not prime");
    }
}
