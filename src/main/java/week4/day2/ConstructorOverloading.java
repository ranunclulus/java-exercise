package week4.day2;

import java.util.Arrays;

public class ConstructorOverloading {
    private int[][] arr;
    public ConstructorOverloading() {
        this.arr = new int[5][5];
    }
    public ConstructorOverloading(int rowCnt) {
        this.arr = new int[rowCnt][5];
    }
    public ConstructorOverloading(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------");
    }

    public static void main(String[] args) {
        int rowCnt = 8;
        int colCnt = 8;
        ConstructorOverloading one = new ConstructorOverloading();
        one.printArr();
        ConstructorOverloading two = new ConstructorOverloading(rowCnt);
        two.printArr();
        ConstructorOverloading three = new ConstructorOverloading(rowCnt, colCnt);
        three.printArr();
    }
}
