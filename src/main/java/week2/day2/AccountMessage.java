package week2.day2;

import java.util.Scanner;

public class AccountMessage {
    public static void main(String[] args) {
        String name = "조희수";
        int balance = 10000;
        String message = name + " 님의 잔고는 " + balance + "입니다";
        String result = String.format("%s 님의 잔고는 %d입니다", name, balance);
        System.out.println(message);
        System.out.println(result);
    }
}
