package week4.day1;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height - i - 1); j++) {
                System.out.printf(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
