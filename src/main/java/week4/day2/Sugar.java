package week4.day2;

import java.util.Arrays;

public class Sugar {
    private int[][] arr;
    public Sugar(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }
    public void setBeam(int length, int direction, int y, int x) {
        if(direction == 0) { // 가로
            for (int i = 0; i < length; i++) {
                arr[y - 1][x - 1 + i] = 1;
            }
        }
        else { // 세로
            for (int i = 0; i < length; i++) {
                arr[y - 1 + i][x - 1] = 1;
            }
        }

    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        Sugar sugar = new Sugar(rowCnt, colCnt);
        sugar.printArr();
        sugar.setBeam(2, 0, 1, 1);
        sugar.printArr();
        sugar.setBeam(3,1, 2, 3);
        sugar.printArr();
    }
}
