package CodeUp;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split("[ ]");
        System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
        System.out.println(Integer.parseInt(num[0]) - Integer.parseInt(num[1]));
        System.out.println(Integer.parseInt(num[0]) * Integer.parseInt(num[1]));
        System.out.println(Integer.parseInt(num[0]) / Integer.parseInt(num[1]));
        System.out.println(Integer.parseInt(num[0]) % Integer.parseInt(num[1]));
        System.out.printf("%.2f", Double.parseDouble(num[0]) / Integer.parseInt(num[1]));
    }
}
