package CodeUp;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int[] array = new int[iVal];
        for (int i = 0; i < iVal; i ++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < iVal; i++){
            System.out.println(array[i]);
        }
    }
}
