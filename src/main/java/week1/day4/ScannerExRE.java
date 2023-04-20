package week1.day4;

import java.util.Scanner;

public class ScannerExRE {
    public void readTwoNumbersPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 각각 입력하고 엔터를 누르세요");
        System.out.println(sc.nextInt() + sc.nextInt());
    }
}
